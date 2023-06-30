public class CountInteger {
    public static int countAndIntegers(int n) {
    int count = 1;
    int powerOfTwo = 2;
    
    while (powerOfTwo <= n) {
        count <<= 1;
        powerOfTwo <<= 1;
    }
    
    return count;
}

public static void main(String[] args) {
    int n = 5;
    int count = countAndIntegers(n);
    System.out.println("Number of integers x satisfying the condition: " + count);
}

}
