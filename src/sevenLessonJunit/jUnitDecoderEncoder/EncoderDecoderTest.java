package sevenLessonJunit.jUnitDecoderEncoder;


import org.junit.Assert;
import org.junit.Test;

public class EncoderDecoderTest {
    static String[] inputStrings = {"AAAAaaaBBBBBB\\12", "AaaaBB2", "AaaaBB\\\\2"};
    static String[] outputStrings = {"4A3a6B\\\\\\1\\2", "1A3a2B\\2", "1A3a2B\\\\\\\\\\2"};

    @Test
    public void mainForEncoder() {

        for (int i = 0; i < inputStrings.length; i++) {
            String outputString = Encoder.getEncodedString(inputStrings[i]);
            System.out.println("input result: "+ inputStrings[i]);
            System.out.println("output result: "+ outputString);
            System.out.println("expected output result: "+ outputStrings[i]);
            System.out.println("---------------");

            Assert.assertTrue(outputString.equals(outputStrings[i]));

        }

    }
}