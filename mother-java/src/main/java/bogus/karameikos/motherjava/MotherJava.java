package bogus.karameikos.motherjava;

public class MotherJava {
    public boolean checkLength(String eingabe) {
        if(eingabe == null) return false;

        if(eingabe.matches("^[0-9]*$") && (eingabe.length()==9)) {

            for (char c : eingabe.toCharArray()) {
                if (eingabe.indexOf(c) != eingabe.lastIndexOf(c)) return false;
            }

            return true;
        }

        return false;
    }


    public boolean isSquare(long eingabe) {
        double root = Math.sqrt(eingabe);
        return (Math.floor(root) == root);
    }

    public String reverse(String eingabe) {
        StringBuilder builder = new StringBuilder();
        for (int i = eingabe.length() - 1; i >= 0; i--) {
            builder.append(eingabe.charAt(i));
        }
        return builder.toString();
    }
}
