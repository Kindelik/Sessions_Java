package Seminar5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Work3 {
    public static void main(String[] args) {
        Map<Character, Integer> slovar = new HashMap<>();
        slovar.put('I', 1);
        slovar.put('V', 5);
        slovar.put('X', 10);
        slovar.put('L', 50);
        slovar.put('C', 100);
        slovar.put('D', 500);
        slovar.put('M', 1000);

        String input = "MDCXLIX";
        List<Integer> sumList = new ArrayList<>();
        int sum = 0;

            for (int i = 0; i < input.length(); i++) {
                Character temp = input.charAt(i);
                 sumList.add(slovar.get(temp));
            }

        for (int i = 0; i < sumList.size()-1; i++) {
            if(sumList.get(i)< sumList.get(i+1)) sum -= sumList.get(i);
            else sum += sumList.get(i);
        }
        sum += sumList.get(sumList.size()-1);
        System.out.println(sumList);
        System.out.println(sum);

    }

}
