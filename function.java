import java.util.*;

public class function {
    public static void main(String[] args) {
        //function z = new function();
        //z.sum2();  //static variable sathi object create kartat
        int ans = sum2();
        System.out.println(ans);
    }

    static int sum2() {
        Scanner in = new Scanner(System.in);
        System.out.print("enter no.1 ");
        int n1 = in.nextInt();
        System.out.print("enter no.2 ");
        int n2 = in.nextInt();
        // int n1 = 10;
        // int n2 = 20;
        int sum = n1 + n2;
        in.close();
        return sum;
        // System.out.println(sum);
       
    }

}