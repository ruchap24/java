public class raj {
    static int a = 10;

    void fun() {
        int b = 10;
        System.out.println(a + " " + b);
        ++a;
        ++b;
    }

    public static void main(String[] args) {
        raj r = new raj();
        // System.out.println(r.a);
        r.fun();
        r.fun();
    }

}
