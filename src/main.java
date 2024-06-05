public class main {
    public static void main(String[] args) {

    }
    // add the method verify prime number
    public static boolean isPrime(int n) {
        // check if n is less than 2
        if (n < 2) {
            return false;
        }
        // check if n is 2
        if (n == 2) {
            return true;
        }
        // check if n is even
        if (n % 2 == 0) {
            return false;
        }
        // check for odd numbers
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
