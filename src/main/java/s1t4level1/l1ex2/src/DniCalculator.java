package s1t4level1.l1ex2.src;

public class DniCalculator {
    private static final char[] DNI_LETTERS = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

    public static char calculateDniLetter(int dniNumber) {
        if (dniNumber < 0 || dniNumber > 99999999) {
            throw new IllegalArgumentException("El número de DNI debe estar entre 0 y 99999999.");
        }
        int index = dniNumber % 23;
        return DNI_LETTERS[index];
    }
}
