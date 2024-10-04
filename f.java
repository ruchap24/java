import java.util.*;

public class f {
    // public static void main(String[] args) {
    // int ans = sum2();
    // System.out.println(ans);
    // }

    // static int sum2() {
    // Scanner sc = new Scanner(System.in);
    // System.out.println("enter no. 1= ");
    // int num1 = sc.nextInt();
    // System.out.println("enter no. 2= ");
    // int num2 = sc.nextInt();
    // sc.close();
    // int sum = num1 + num2;
    // // sc.close();
    // return sum;
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n1 and n2= ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        //fun(n1, n2);
        sc.close();
        System.out.println(fun(n1, n2));
        // varchi line comment out keli tr fun madhl return pn comment out karne ani fun
        // chya aadhi void ghene int kholun
    }

    public static int fun(int n1, int n2) {
        int sum = n1 + n2;
        // System.out.println(sum);
        return sum;
    }
}
