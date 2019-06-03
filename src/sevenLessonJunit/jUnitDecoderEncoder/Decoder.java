package sevenLessonJunit.jUnitDecoderEncoder;

public class Decoder {
    public static String getDecodedString(String strToDecode) {

        StringBuilder result = new StringBuilder();
        char[] chars = strToDecode.toCharArray();

        for (int i = 0; i < strToDecode.length(); i += 2) {

            String pair = strToDecode.substring(i, i + 2);
            String decodedPair = getDecodedSubstring(pair);
            result.append(decodedPair);
            //result.append(getDecodedSubstring(strToDecode.substring(i,i+2)));
        }
        return result.toString();
    }

    private static String getDecodedSubstring(String pairToDecode) {

        char controlChar = pairToDecode.charAt(0);
        Character decodedValue = pairToDecode.charAt(1);

        if (controlChar == '\\') {
            return decodedValue.toString();
        } else if (Character.isDigit(controlChar)) {
            StringBuilder result = new StringBuilder();
            int numberOfDecodedValue = Character.getNumericValue(controlChar);
            for (int i = 0; i < numberOfDecodedValue; i++) {
                result.append(decodedValue);
            }
            return result.toString();
        }
        return "";
    }
}
