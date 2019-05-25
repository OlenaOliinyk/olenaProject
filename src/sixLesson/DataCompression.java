package sixLesson;

public class DataCompression {


    public static void main(String[] args) {

        String str1 = "AAAAaaaBBBBBB\\12";
        String value1 = encode(str1);
        System.out.println("Output string1: "+value1);

        String str2 = "AaaaBB2";
        String value2 = encode(str2);
        System.out.println("Output string2: "+value2);

        String str3 = "AaaaBB\\2";
        String value3 = encode(str3);
        System.out.println("Output string3: "+value3);
    }
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