package BasicProg;

import java.util.List;

public class StringContainsDigits {

    public static boolean isEmpty(CharSequence str) {
        return str == null || str.length() == 0;
    }

    public static boolean isNumeric(CharSequence str) {
        if (isEmpty(str)) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                System.out.println(str.charAt(i));
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        System.out.println(isNumeric("+12"));

    }
}
