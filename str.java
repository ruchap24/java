public class str {
    public static void main(String[] args) {
        String name = "rucha Surendra PATIL";
        methods(name);
    }

    public static void methods(String name) {
        for (int i = 1; i <= name.length(); i++) {
            System.out.print(name.charAt(i) + " ");
        }
    }

}
