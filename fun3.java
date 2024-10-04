public class fun3 {
    public static void main(String args[]) {
        int a = 5;
        int b = 3;
        int d = change(a, b);
        System.out.println(d);  
        System.out.println(change(a, b));
    }

    static int change(int a, int b) {
        int pro = a * b;
        return pro;
    }

}
