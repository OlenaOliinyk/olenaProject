package sevenLessonJunit.jUnitDecoderEncoder;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;
import org.junit.Test;

public class EncoderDecoderTest {
    private static String[] decodedStrings = {"AAAAaaaBBBBBB\\12", "AaaaBB2", "AaaaBB\\\\2"};
    private static String[] encodedStrings = {"4A3a6B\\\\\\1\\2", "1A3a2B\\2", "1A3a2B\\\\\\\\\\2"};
    private Logger logger = Logger.getLogger(getClass());

    @Test
    public void mainForEncoder() {

        String log4jConfPath = "../log4j.properties";
        PropertyConfigurator.configure(log4jConfPath);

        logger.info("Encode test :");
        for (int i = 0; i < decodedStrings.length; i++) {
            String outputString = Encoder.getEncodedString(decodedStrings[i]);
            logger.info(" input result: " + decodedStrings[i]);
            logger.info(" output result: " + outputString);
            logger.info(" expected output result: " + encodedStrings[i]);
            logger.info("-------------------");

            Assert.assertTrue(outputString.equals(encodedStrings[i]));

        }
    }

    @Test

    public void mainForDecoder() {
        String log4jConfPath = "../log4j.properties";
        PropertyConfigurator.configure(log4jConfPath);
        logger.info("Decode test: ");

        for (int i = 0; i < encodedStrings.length; i++) {

            String outputString = Decoder.getDecodedString(encodedStrings[i]);

            logger.info(" input result: "+ encodedStrings[i]);
            logger.info(" output result: "+ outputString);
            logger.info(" expected output result: " + decodedStrings[i]);
            logger.info("------------------");

            Assert.assertTrue(outputString.equals(decodedStrings[i]));
        }

    }
}