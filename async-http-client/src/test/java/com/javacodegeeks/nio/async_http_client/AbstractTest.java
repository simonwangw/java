package com.javacodegeeks.nio.async_http_client;

import org.junit.AfterClass;
import org.junit.BeforeClass;

public abstract class AbstractTest {

	@BeforeClass
	public static void init() {
		Thread.currentThread().getContextClassLoader().setDefaultAssertionStatus(true);
	}

	@AfterClass
	public static void destroy() {
		Thread.currentThread().getContextClassLoader().setDefaultAssertionStatus(false);
	}
}
