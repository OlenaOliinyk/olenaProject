package sevenLessonJunit.jUnitDecoderEncoder;


public class Encoder {

    private static char[] charsToSlash = {'\\', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};

    public static String getEncodedString(String strToEncode) {
        if (strToEncode == null || strToEncode.isEmpty()) return strToEncode;
        StringBuilder result = new StringBuilder();
        char[] chars = strToEncode.toCharArray();

        for (int i = 0; i < strToEncode.length(); i++) {
            if (isCharToSlash(chars[i])) {
                result.append(addSlash(chars[i]));
            } else {
                int charCount = 1;
                while (i < chars.length - 1 && chars[i] == chars[i + 1]) {
                    charCount++;
                    i++;
                }
                result.append(charCount).append(chars[i]);
            }
        }
        return result.toString();
    }

    private static String addSlash(char charToSlash) {
        return new StringBuilder().append('\\').append(charToSlash).toString();
    }

    private static boolean isCharToSlash(char aChar) {
        for (char c : charsToSlash) {
            if (aChar == c) {
                return true;
            }
        }
        return false;
    }

}
