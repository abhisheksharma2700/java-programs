
import java.io.IOException;

public class ThrowsKeyword {
    void show()throws IOException{
        throw new IOException("this is an io exception");


    }
    public static void main(String[] args) throws IOException {
        ThrowsKeyword t= new ThrowsKeyword();
        t.show();
    }
}
