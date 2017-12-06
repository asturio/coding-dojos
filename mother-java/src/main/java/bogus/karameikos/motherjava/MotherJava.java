package bogus.karameikos.motherjava;

import java.util.HashSet;
import java.util.Set;

public class MotherJava {
    // 9-different-digits-code
    public boolean checkFormat(String eingabe) {
        boolean result = false;
        if (eingabe != null && eingabe.length() == 9) {
            Set<Character> set = new HashSet<>();
            for (char c : eingabe.toCharArray()) {
                if ('0' <= c && c <= '9') {
                    set.add(c);
                }
            }
            if (set.size() == 9) { // 9 different digits
                result = true;
            }
        }
        return result;
    }


    public boolean isSquare(long eingabe) {
        double root = Math.sqrt(eingabe);
        return (Math.floor(root) == root);
    }

    public String reverse(String eingabe) {
        char[] chars = eingabe.toCharArray();
        char[] reverse = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            reverse[(reverse.length - 1) - i] = chars[i];
        }
        return new String(reverse);
    }
}
