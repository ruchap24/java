import java.util.Arrays;

public class arr {
    public static void main(String[] args) {
        // int arr[] = { 1, 3, 2, 45, 6 };
        int[] arr = { 1, 3, 2, 45, 6 };
        fun(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void fun(int[] nums) {
        nums[0] = 99;
        nums[1] = 12;
    }
}
