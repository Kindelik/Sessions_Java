package Seminar6;

import java.util.*;

public class Work1 {
    public static void main(String[] args) {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) arr[i] = new Random().nextInt(0, 25);
        Set<Integer> unicInt = new HashSet<>();
        for (int item : arr) unicInt.add(item);
        int colSize = unicInt.size();
        // Collections.unicInt.addAll(Arrays.asList(arr));
        float percUnic = Float.parseFloat(String.valueOf(colSize * 100)) / Float.parseFloat(String.valueOf(arr.length));
        System.out.println(percUnic);
    }
}

