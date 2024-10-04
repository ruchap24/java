public class primebet {
    public static void main(String args[]) {
        range(20);
        // int i;
        // if (i == 2) {
        // System.out.print(i + " ");
        // }
        // for (i = 2; i <= 20; i++) {
        // if (i % 2 == 0) {
        // System.out.print(" ");
        // }
        // System.out.print(i);
        // }
    }

    public static void range(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                System.out.println(Math.sqrt(i));
            }
        }
        System.out.println();
    }

    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= n - 1; i++) // or (int i=2;i<=Math.sqrt(n);i==;)
        {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
