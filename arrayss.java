//import java.util.Arrays;
import java.util.*;
public class arrayss {
    public static void main(String args[]) {
        int num[] = { 2, 3, 4, 5, 6, 7, 8, 9 };
        int b[]={2,3,4,5,6,7,8,9};
        if(Arrays.equals(num,b)){
            System.out.println("true");
        }
        else{
            System.out.println("false"); 
        }
     //   Arrays.sort(num);
        int key = 6;
        int index = linear(num, key);
        if (index == -1) {
            System.out.println("not found");
        } else {
            System.out.println("key is at index of" + index);
        }
    }

    public static int linear(int num[], int key) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] == key) {
                return i;
            }
        }
        return -1;
    }
}