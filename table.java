import java.util.*;

public class table {
    public static void main(String[] args) {
        int a;
        System.out.println("enter a no.");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(a + "*" + i + "=" + (a * i));
        }
        sc.close();
    }
}
