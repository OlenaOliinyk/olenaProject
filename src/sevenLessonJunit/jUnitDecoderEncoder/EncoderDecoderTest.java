package sevenLessonJunit.jUnitDecoderEncoder;


import org.junit.Assert;
import org.junit.Test;

public class EncoderDecoderTest {
 private    static String[] decodedStrings = {"AAAAaaaBBBBBB\\12", "AaaaBB2", "AaaaBB\\\\2"};
   private static String[] encodedStrings = {"4A3a6B\\\\\\1\\2", "1A3a2B\\2", "1A3a2B\\\\\\\\\\2"};


    @Test
    public void mainForEncoder() {
        System.out.println("Encode test :");
        for (int i = 0; i < decodedStrings.length; i++) {
            String outputString = Encoder.getEncodedString(decodedStrings[i]);
            System.out.println(" input result: "+ decodedStrings[i]);
            System.out.println(" output result: "+ outputString);
            System.out.println(" expected output result: "+ encodedStrings[i]);
            System.out.println("---------------");

            Assert.assertTrue(outputString.equals(encodedStrings[i]));

        }

    }
    @Test

    public void mainForDecoder(){
        System.out.println("Decode test: ");
        for (int i = 0; i < encodedStrings.length; i++) {

            String outputString = Decoder.getDecodedString(encodedStrings[i]);
            System.out.println(" input result: "+ encodedStrings[i]);
            System.out.println(" output result: "+ outputString);
            System.out.println(" expected output result: "+ decodedStrings[i]);
            System.out.println("---------------");

           Assert.assertTrue(outputString.equals(decodedStrings[i]));
        }

    }
}