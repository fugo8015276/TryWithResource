public class SampleResource implements AutoCloseable {
    //Exceptionをthrowする。AutoCloseableは入出力以外も対応する。
    @Override
    public void close() throws Exception {
        System.out.println("close");
    }
}
