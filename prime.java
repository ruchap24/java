public class prime {
    // public static void main(String args[]) {
    // // isPrime(21);
    // System.out.println(isPrime(101));
    // }
    // public static boolean isPrime(int n) {
    // for (int i = 2; i <= n - 1; i++) {
    // if (n % i == 0) {
    // return false;
    // }
    // }
    // return true;
    // }

    public static void main(String args[]) {
        System.out.println(isPrime(47));
    }

    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= n-1; i++) //or (int i=2; i<=Math.sqrt(n);i++);
         {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
