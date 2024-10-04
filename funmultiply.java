import java.util.*;

public class funmultiply {
    public static int multiply(int a, int b) {
        int multi = a * b;
        return multi;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // int MULTI = multiply(a, b);
        // System.out.println(MULTI);
        System.out.println((multiply(a, b)));
        sc.close();
    }
}
