import java.io.Closeable;
import java.io.IOException;

//IOExceptionをthrowする。あくまで入出力ストリームのみに対応している。
public class SampleResource2 implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("close");
    }
}
