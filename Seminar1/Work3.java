package Seminar1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Work3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 1, 1, 5};
        int number = 1;
        int temp = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                arr[i] = arr[arr.length - count-1];
                arr[arr.length - count - 1] = number;
                count++;
                System.out.println(Arrays.toString(arr));
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

