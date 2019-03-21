package Experience_2_5;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.IOException;

public class Encryption {

    //Base64加密
    public String encrypt(String text){
        BASE64Encoder encoder = new BASE64Encoder();
        String encode = encoder.encode(text.getBytes());
        return encode;
    }

    public String deEncrypt(){
        BASE64Decoder decoder = new BASE64Decoder();
        try {
            byte[] encode = decoder.decodeBuffer(new Read().readFile());
            return new String(encode);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
