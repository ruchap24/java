import java.util.Scanner;

public class inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // System.out.print("enter ur input");
        // int roll_no= input.nextInt();
        // System.out.println("your roll no is"+ roll_no);
        // String name=input.nextLine();
        // System.out.println(name);
        // float marks=input.nextFloat(); //enter 22.327854
        // System.out.println(marks);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("sum= " + sum);
        input.close();
    }
}
