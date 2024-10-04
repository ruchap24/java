import java.util.*;

public class switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();
        switch (fruit) {
            case "mango":
                System.out.println("king of fruits");
                break;
            case "apple":
                System.out.println("sweet");
                break;
            case "orange":
                System.out.println("fruits");
                break;
            // alt+ enter kel tr new format madhe arrange hot pn aaplya laptop madhe hot nhi
            default:
                System.out.println("enter name 0f fruits");
                sc.close();
        }
    }
}
