import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isArmstrong(n));
        sc.close();
    }

    public static boolean isArmstrong(int n) {
        int c = n;
        int r, s = 0;
        while (n > 0) {
            r = n % 10;
            s = (r * r * r) + s;
            n = n / 10;
        }
        if (s == c) {
            return true;
        }
        return false;
    }
}
