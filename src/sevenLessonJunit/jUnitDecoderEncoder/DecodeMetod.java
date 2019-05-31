package sevenLessonJunit.jUnitDecoderEncoder;

public class DecodeMetod {
    static   String decode(String string) {
        if (string == null || string.isEmpty()) return "";

        StringBuilder builder = new StringBuilder();
        char[] chars = string.toCharArray();
        boolean preIsDigit = false;
        String digitString = "";
        for(char current: chars) {
            if (!Character.isDigit(current)) {
                if (preIsDigit){
                    String multipleString = new String(new char[Integer.valueOf(digitString)]).replace("\0",current+"");
                    builder.append(multipleString);
                    preIsDigit = false;
                    digitString = "";
                } else{
                    builder.append(current);
                }
            } else {
                digitString+=current;
                preIsDigit = true;
            }
        }
        return builder.toString();
    }
}
