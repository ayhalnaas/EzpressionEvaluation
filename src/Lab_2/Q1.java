package Lab_2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Q1 {
    public static void reverse(int a[]){
        int n = a.length-1;
        for (int i = 0; i < a.length/2; i++) {
            int y = a[i];
            a[i] =a[n];
            a[n]=y;
            n--;
        }
    }
    public static void main(String[] args) {
        int array[] ={1,2,3,4,5,6};
        System.out.println(Arrays.toString(array));
        reverse(array);
        System.out.println(Arrays.toString(array));




    }
}
