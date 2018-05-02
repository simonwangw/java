import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Method;

import com.alibaba.study.rpc.test.HelloService;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

/**
 * this class shows how ObjectInputStream and ObjectOutputStream works
 * which will be utilized in RPC
 */
public class StreamTest {

    private File file;

    @Before
    public void setup() {
        this.file = new File(StreamTest.class.getResource("/").getPath() + "/" + System.currentTimeMillis() + ".log");
    }

    @Test
    //@Ignore
    public void testWriteAndRead() {
        try {
            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(this.file));
            Method method = HelloService.class.getMethod("hello", String.class);
            output.writeUTF(method.getName());
            output.writeObject(method.getParameterTypes());
            Object[] arr = new Object[1];
            arr[0] = "world";
            output.writeObject(arr);
            output.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    @Test
    @Ignore
    public void testRead() {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(this.file));
            String methodName = ois.readUTF();

            Class<?>[] parameterTypes = (Class<?>[])ois.readObject();
            Object[] arguments = (Object[])ois.readObject();
            System.out.println(methodName);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
