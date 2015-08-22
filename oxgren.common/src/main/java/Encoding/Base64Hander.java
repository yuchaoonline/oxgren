package Encoding;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

/**
 * basic  url  mime 三种方式
 * Created by YuChao on 2015/8/21.
 */
public class  Base64Hander {

    /**
     * 解密
     *
     * @param code
     * @return
     * @see [类、类#方法、类#成员]
     */
    public static String decodeStr(String code) throws UnsupportedEncodingException {
        // 解码
        byte[] asBytes = Base64.getDecoder().decode(code);
        return new String(asBytes, "utf-8");
    }

    /**
     * 加密
     *
     * @param code
     * @return
     * @see [类、类#方法、类#成员]
     */
    public static String encodeStr(String code) throws UnsupportedEncodingException {
        // 编码
        String asB64 = Base64.getEncoder().encodeToString(code.getBytes("utf-8"));
        return asB64;
    }

    /**
    * url 加密
    *
    * */
    public static String urlEncodeStr(String code)  throws UnsupportedEncodingException
    {
        String urlEncoded = Base64.getUrlEncoder().encodeToString(code.getBytes("utf-8"));
        return urlEncoded;
    }

    /**
     * url 解密
     *
     * */
    public static String urlDecodeStr(String code) throws UnsupportedEncodingException {
        // 解码
        byte[] asBytes = Base64.getUrlDecoder().decode(code);
        return new String(asBytes, "utf-8");
    }




    /**
     * mime 编码
     *
     * */
    public static String mimeEncodeStr(String code) throws UnsupportedEncodingException {


        String mimeEncoded = Base64.getMimeEncoder().encodeToString(code.getBytes("utf-8"));
        return   mimeEncoded;

    }


    /**
     * mime 解码
     *
     * */
    public static String mimeDecodeStr(String code) throws UnsupportedEncodingException {
        // 解码
        byte[] asBytes = Base64.getMimeDecoder().decode(code);
        return new String(asBytes, "utf-8");
    }
}