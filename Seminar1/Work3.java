package Seminar1;

import java.util.Arrays;

public class Work3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 1, 1, 5, 5, 1, 1, 5, 1, 1};
        int number = 5;
        int temp = 0;
        int count = 0;

        for (int j : arr) {
            if (j == number) temp++;
        }

//        for (int i = 0; i < arr.length - temp; i++) {
//            if (arr[arr.length - count - 1] == number) count++;
//            if (arr[i] == number) {
//                arr[i] = arr[arr.length - count - 1];
//                arr[arr.length - count - 1] = number;
//                count++;
//                System.out.println(Arrays.toString(arr));
//            }
//        }
        while (temp-- >= 0) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] == number) {
                    arr[i] = arr[i + 1];
                    arr[i + 1] = number;
                }

            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

