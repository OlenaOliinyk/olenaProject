package sevenLessonJunit.jUnitDecoderEncoder;


import org.junit.Test;

public class MainEncoder {

    @Test
    public void mainForEncoder() {
        EncodeMetod encodeMetod = new EncodeMetod();
        DecodeMetod decodeMetod = new DecodeMetod();

        String str1 = "AAAAaaaBBBBBB\\112";
        System.out.println("Encoder result: "+encodeMetod.encode(str1));


        String str2 = "AaaaBB2";
        System.out.println("Encoder result: "+encodeMetod.encode(str2));

        String str3 = "AaaaBB\\2";
        System.out.println("Encoder result: "+encodeMetod.encode(str3));


        String str11 = "4A3a6B\\\\\\1\\2";
        System.out.println("Decoder result: "+decodeMetod.decode(str11));

    }
}