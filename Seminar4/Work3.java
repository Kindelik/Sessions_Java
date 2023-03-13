package Seminar4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//        1) Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стэка.
//        2) Написать метод, который принимает массив элементов, помещает их в очередь и выводит на консоль содержимое очереди.
public class Work3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 9, 7, 6, 2, 5, 4};
        Stack arrSt = copyArrStack(arr);
        Queue arrQu = copyArrQueue(arr);
        System.out.println(arrSt);
        System.out.println(arrQu);
    }

    public static Stack copyArrStack(int[] arr) {
        Stack stackArr = new Stack<>();
        for (int item : arr) {
            stackArr.push(item);
        }
        return stackArr;
    }

    public static Queue copyArrQueue(int[] arr) {
        Queue<Object> queueArr = new LinkedList<>();
        for (Object item : arr) {
            queueArr.add(item);

        }
        return queueArr;
    }

}

