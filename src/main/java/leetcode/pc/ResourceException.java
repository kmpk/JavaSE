package leetcode.pc;

public class ResourceException implements AutoCloseable{

    public ResourceException() throws Exception {
//        throw new Exception("constructor");
    }

    public void doSmth() throws Exception{
        throw new Exception("doSmth");
    }

    @Override
    public void close() throws Exception {
        throw new Exception("close");
    }
}
