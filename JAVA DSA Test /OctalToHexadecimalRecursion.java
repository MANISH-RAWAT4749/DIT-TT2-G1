import java.util.Scanner;

public class OctalToHexadecimalRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input octal number: ");
        String octalNumber = scanner.next();
        scanner.close();

        String hexadecimalNumber = convertOctalToHexadecimal(octalNumber);
        System.out.println("Hexadecimal number: " + hexadecimalNumber.toUpperCase());
    }

    public static String convertOctalToHexadecimal(String octalNumber) {
        // First, convert the octal number to binary
        String binaryNumber = convertOctalToBinary(octalNumber);

        // Then, convert the binary number to hexadecimal
        String hexadecimalNumber = convertBinaryToHexadecimal(binaryNumber);
        return hexadecimalNumber;
    }

    public static String convertOctalToBinary(String octalNumber) {
        StringBuilder binaryNumber = new StringBuilder();
        for (int i = 0; i < octalNumber.length(); i++) {
            char digit = octalNumber.charAt(i);
            int decimal = Character.getNumericValue(digit);
            String binary = Integer.toBinaryString(decimal);
            while (binary.length() < 3) {
                binary = "0" + binary; // Make sure each digit is represented by 3 bits
            }
            binaryNumber.append(binary);
        }
        return binaryNumber.toString();
    }

    public static String convertBinaryToHexadecimal(String binaryNumber) {
        return convertBinaryToHexadecimalRecursive(binaryNumber, binaryNumber.length() - 1, 0);
    }

    public static String convertBinaryToHexadecimalRecursive(String binaryNumber, int index, int decimal) {
        if (index < 0) {
            return Integer.toHexString(decimal);
        }

        char digit = binaryNumber.charAt(index);
        int binaryDigit = Character.getNumericValue(digit);
        decimal += binaryDigit * Math.pow(2, binaryNumber.length() - 1 - index);

        return convertBinaryToHexadecimalRecursive(binaryNumber, index - 1, decimal);
    }
}
