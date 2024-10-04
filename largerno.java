import java.util.*;

public class largerno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = a;
        if (b > max) {
            max = b;
        } else if (c > max) {
            max = c;
        }
        System.out.print(max);
        sc.close();
    }
}
