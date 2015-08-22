import Encoding.Base64Hander;
import org.junit.Test;

public class Base64HanderTest {

    @Test
    public void Base64Hander() throws Exception {
        String code= "进入java的世界";
        System.out.println("encodeStr:"+Base64Hander.encodeStr(code));
        System.out.println("urlEncodeStr:"+Base64Hander.urlEncodeStr(code));
        System.out.println("mimeEncodeStr:"+Base64Hander.mimeEncodeStr(code));
    }




}