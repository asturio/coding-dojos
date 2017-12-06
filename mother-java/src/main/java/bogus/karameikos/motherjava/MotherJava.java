package bogus.karameikos.motherjava;

class MotherJava {
    // 9-different-digits-code
    boolean checkFormat(String eingabe) {
        boolean result = false;
        if (eingabe != null && eingabe.length() == 9) {
            result = true;
            for (char c : eingabe.toCharArray()) {
                if ((c < '0' || '9' < c)
                        || (eingabe.indexOf(c) != eingabe.lastIndexOf(c))) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }


    boolean isSquare(long eingabe) {
        double root = Math.sqrt(eingabe);
        return (Math.floor(root) == root);
    }

    String reverse(String eingabe) {
        char[] chars = eingabe.toCharArray();
        char[] reverse = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            reverse[(reverse.length - 1) - i] = chars[i];
        }
        return new String(reverse);
    }
}
