package bogus.karameikos.motherjava;

public class MotherJavaTester {
    public static void main(String... args) {
        MotherJava mother = new MotherJava();

        // option 1: The combination must be a valid 9-digit number (no leading zeros): 102345678
        // option 2: The combination must not be a valid 9-digit number (leading zeros are ok): 012345678
        long lowestCombination = 12345678; // as Code 012345678
        long highestCombination = 987654321; // there is only this option

        long start = System.nanoTime();
        int count = 0;
        for (long eingabe = highestCombination; eingabe >= lowestCombination; eingabe--) {
            String eingabeStr = Long.toString(eingabe);
            ++count;
            if (mother.checkLength(eingabeStr)) {
                // only do extra work, if the first condition is passed
                String reverse = mother.reverse(eingabe+"");
                if (mother.isSquare(Long.parseLong(reverse))) {
                    System.out.println("Zahl gefunden: " + eingabeStr + ", reverse: " + reverse + " ist quadrat");
                    break;
                }
            }
        }
        System.out.println("Terminated in " + ((System.nanoTime() - start) / 1E6) + " ms." +
                " After " + count + " iterations.");
    }
}
