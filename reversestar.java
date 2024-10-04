// import java.util.*;

// public class reversestar {
//     public static void main(String args[]) {
//         int a;
//         System.out.println("enter value of n");
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         a = n;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= a; j++) {
//                 System.out.print("*");
//             }
//             a--;
//             System.out.println();
//             sc.close();
//         }
//     }
// }

// or.....

// public class reversestar {
//     public static void main(String args[]) {
//         int r = 5;
//         for (int i = r; i >= 1; --i) {
//             for (int j = 1; j <= i; ++j) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// or........

public class reversestar {
    public static void main(String args[]) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}