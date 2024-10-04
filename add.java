import java.util.*;

public class add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no.1: ");
        int a = sc.nextInt();
        // int a = input.nextInt(); ithe jr sc evaji input ghetl tr scanner nantar pn input ghene
        System.out.print("enter no.2: ");
        int b = sc.nextInt();
        // 231,000,000 hi value java madhe ashi lihitat 231_000_000
        // java madhe float & long LargeInt vaparl tr value chya shevati f & L ghene

        int sum = a + b;
        System.out.println(sum);

        int diff = b - a;
        System.out.println("subtraction is " + diff);

        int mul = a * b;
        System.out.println(mul);

        sc.close();
    }
}

//type casting
//int num=(int)(34.343f);
//System.out.println(num);