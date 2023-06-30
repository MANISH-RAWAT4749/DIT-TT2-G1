public class PalindromicBinaryRepresentation {
    
    public static int isPalindrome(int num) {
        int reverse = 0;
        int temp = num;
        
        while (temp > 0) {
            reverse = (reverse << 1) | (temp & 1);
            temp >>= 1;
        }
        
        return num == reverse ? 1 : 0;
    }

    public static int findAthPalindromicBinary(int A) {
        int count = 0;
        int num = 0;
        
        while (count < A) {
            num++;
            if (isPalindrome(num) == 1) {
                count++;
            }
        }
        
        return num;
    }

    public static void main(String[] args) {
        int A = 5;
        int result = findAthPalindromicBinary(A);
        System.out.println("Ath number with palindrome binary representation: " + result);
    }
}
