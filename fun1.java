import java.util.*;

public class fun1 {
    public static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int addition = sum(a, b);
        System.out.println(addition);
        sc.close();
    }
}
