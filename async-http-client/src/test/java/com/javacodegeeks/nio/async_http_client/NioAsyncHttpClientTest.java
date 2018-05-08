package com.javacodegeeks.nio.async_http_client;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.nio.channels.AsynchronousChannelGroup;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.util.Optional;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Supplier;

import org.apache.commons.lang3.StringUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class NioAsyncHttpClientTest extends AbstractTest {

    private static final String HEADERS_TEMPLATE = "%s /%s HTTP/1.1\r\n" + "Accept: %s\r\n" + "Content-Length: %s\r\n" + "Content-Type: text/plain\r\n";

    private AsynchronousChannelGroup asynchronousChannelGroup;

    @Before
    public void setUp() throws IOException {
        this.asynchronousChannelGroup = AsynchronousChannelGroup.withFixedThreadPool(2, Executors.defaultThreadFactory());
    }

    @After
    public void tearDown() throws IOException {
        this.asynchronousChannelGroup.shutdown();
    }

    @Test
    public void java2sDotCom() throws Exception {
        doGet(() -> "http://www.java2s.com", () -> String.format(HEADERS_TEMPLATE, "GET", StringUtils.EMPTY, "text/*", String.valueOf(0)));
    }

    @Test
    public void now() throws Exception {
        doGet(() -> "https://now.httpbin.org/", () -> String.format(HEADERS_TEMPLATE, "GET", StringUtils.EMPTY, "application/json", String.valueOf(0)));
    }

    @Test
    public void get() throws Exception {
        doGet(() -> "https://httpbin.org/get", () -> String.format(HEADERS_TEMPLATE, "GET", "get", "application/json", String.valueOf(0)));
    }

    @Test
    public void put() throws Exception {
        final String body = "Hello world";
        doPost(() -> "https://httpbin.org/put", () -> String.format(HEADERS_TEMPLATE, "PUT", "put", "application/json", String.valueOf(body.length())), Optional.of(body));
    }

    @Test
    public void post() throws Exception {
        final String body = "Feeling hungry!";
        doPost(() -> "https://httpbin.org/post", () -> String.format(HEADERS_TEMPLATE, "POST", "post", "application/json", String.valueOf(body.length())), Optional.of(body));
    }

    @Test
    public void delete() throws Exception {
        doPost(() -> "https://httpbin.org/delete", () -> String.format(HEADERS_TEMPLATE, "DELETE", "delete", "application/json", String.valueOf(0)), Optional.empty());
    }

    private void doGet(final Supplier<? extends String> url, final Supplier<? extends String> headers) throws Exception {

        final WritableByteChannel target = Channels.newChannel(System.out);
        final AtomicBoolean pass = new AtomicBoolean(true);
        final CountDownLatch latch = new CountDownLatch(1);

        try (NioAsyncHttpClient client = NioAsyncHttpClient.create(this.asynchronousChannelGroup)) {
            client.get(url.get(), headers.get(), (buffer) -> {
                try {
                    buffer.flip();

                    while (buffer.hasRemaining()) {
                        target.write(buffer);
                    }
                } catch (IOException e) {
                    pass.set(false);
                } finally {
                    latch.countDown();
                }
            }, (exc) -> {
                exc.printStackTrace();
                pass.set(false);
                latch.countDown();
            });
        }

        latch.await();
        assertTrue("Test failed", pass.get());
    }

    private void doPost(final Supplier<? extends String> url, final Supplier<? extends String> headers, final Optional<String> data) throws Exception {

        final WritableByteChannel target = Channels.newChannel(System.out);
        final AtomicBoolean pass = new AtomicBoolean(true);
        final CountDownLatch latch = new CountDownLatch(1);

        try (NioAsyncHttpClient client = NioAsyncHttpClient.create(this.asynchronousChannelGroup)) {
            client.post(url.get(), data.orElse(StringUtils.EMPTY), headers.get(), (buffer) -> {
                try {
                    buffer.flip();

                    while (buffer.hasRemaining()) {
                        target.write(buffer);
                    }
                } catch (IOException e) {
                    pass.set(false);
                } finally {
                    latch.countDown();
                }
            }, (exc) -> {
                exc.printStackTrace();
                pass.set(false);
                latch.countDown();
            });
        }

        latch.await();
        assertTrue("Test failed", pass.get());
    }
}
