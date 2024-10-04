// import java.util.*;

public class arm1000 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i)) {
                System.out.println(i + " ");
            }
        }
    }

    static boolean isArmstrong(int n) {
        int c = n;
        int r, s = 0;
        while (n > 0) {
            r = n % 10;
            s = (r * r * r) + s;
            n = n / 10;
        }
        if (s == c) {
            return true;
        } else
            return false;
    }
}
