import java.util.*;

public class switchh {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        switch (button) {
            case 1:
                System.out.println("hii");
                break;
            case 2:
                System.out.println("bonjour");
                break;
            case 3:
                System.out.println("hie");
                break;
            case 4:
                System.out.println("hello");
                break;
            default:
                System.out.println("invalid button");
        }
        sc.close();
    }

}
