import java.util.*;

public class switchcase1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int empID = sc.nextInt();
        String department = sc.next();
        switch (empID) {
            case 1:
                System.out.println("ugfvhjhhu");
                break;
            case 2:
                System.out.println("uhu");
                break;
            case 3:
                System.out.println("emp no. 3");
                switch (department) {
                    case "IT":
                        System.out.println("it department");
                        break;
                    case "management":
                        System.out.println("management");
                        break;
                    default:
                        System.out.println("invalid");
                }
                sc.close();
        }
    }
}
