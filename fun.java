import java.util.*;

public class fun {
    public static void printmyname(String name) {
        System.out.println(name);
        return;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();         //ek word print hoil
        //String name = sc.nextLine();  // purn sentence print hoil
        printmyname(name);
        sc.close();
    }
}
