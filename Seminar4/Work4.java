package Seminar4;

import java.util.Stack;

//Реализовать стэк с помощью массива.
//        Нужно реализовать методы:
//        size(), empty(), push(), peek(), pop().
public class Work4 {
    public static void main(String[] args) {

        int[] arr = {1, 6, 5, 4, 8, 6, 54, 5, 1, 5, 6654, 4};
        Stack stackOne = copyArrStack(arr);
        System.out.println(arr);
    }

    public static Stack copyArrStack(int[] arr) {
        Stack stackArr = new Stack<>();
        for (int item : arr) {
            stackArr.push(item);
        }
        return stackArr;
    }

    public static int arrSize(int[] arr) {
        int x = arr.length;
        return x;
    }

    public static void emptyArr(int[] arr) {
        if (arr.length > 0) System.out.println("Массив не пустой");
        else System.out.println("Массив  пустой");
    }

    public static int[] puchArr(int[] arr, int x) {
        int[] arrNew = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            arrNew[i] = arr[i];
        }
        arrNew[arrNew.length - 1] = x;
        return arrNew;
    }
}


