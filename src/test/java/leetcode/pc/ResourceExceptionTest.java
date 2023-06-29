package leetcode.pc;

import org.junit.Test;

import static org.junit.Assert.*;

public class ResourceExceptionTest {

    @Test
    public void close() {
        try (ResourceException resourceException = new ResourceException()) {
            resourceException.doSmth();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}