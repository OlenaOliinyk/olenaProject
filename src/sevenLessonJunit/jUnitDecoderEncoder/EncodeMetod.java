package sevenLessonJunit.jUnitDecoderEncoder;

public class EncodeMetod {

    public static String encode(String string) {
        if (string == null || string.isEmpty()) return "";

        StringBuilder builder = new StringBuilder();
        char[] chars = string.toCharArray();
        char current = chars[0];
        int count = 1;

        for (int i = 1; i < chars.length; i++) {

            if (current == chars[i]) {
                count++;
            } else {
                if (count >= 1) builder.append(count);
                builder.append(current);
                current = chars[i];
                count = 1;
            }
        }
        if (count >= 1) builder.append(count);
        builder.append(current);
        return builder.toString();
    }
}
