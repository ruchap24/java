import java.util.*;

public class ifelse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a");
        int a = sc.nextInt();
        System.out.print("enter b");
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("equal");
        } else {
            if (a > b) {
                System.out.println("a is greater than b");
            } else {
                System.out.println("b is greater than a");
                // close the scanner to release the system resourse
                sc.close();
            }
        }
    }
}