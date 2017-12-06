package bogus.karameikos.motherjava;

public class MotherJavaTester {
    public static void main(String... args) {
        MotherJava mother = new MotherJava();

        for (long eingabe = 987654321; eingabe > 0; eingabe--) {
            String eingabeStr = Long.toString(eingabe);
            String reverse = mother.reverse(eingabe+"");

            if (mother.checkLength(eingabeStr) && mother.isSquare(Long.parseLong(reverse))) {
                System.out.println("Zahl gefunden: " + eingabeStr + ", " + reverse + " ist ²");
                break;
            }
        }
    }
}
