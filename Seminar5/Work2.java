package Seminar5;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Work2 {
    public static void main(String[] args) {
        Map<Character, Character> slov = new HashMap<>();
        slov.put('(', ')');
        slov.put('{', '}');
        slov.put('[', ']');
        slov.put('<', '>');
        String input = "(a+(d*3)";

        for (Character key : slov.keySet()) {
            int index = input.length() - 1;
            for (int i = 0; i < input.length(); i++) {
                Character temp = input.charAt(i);
                if (temp.equals(key)) {
                    if(twoznak(input,slov.get(key), i, index)) System.out.println("совпало");
                    else System.out.println("не совпало");

                    }
                }
            }
        }

    public static boolean twoznak(String x, Character y, int i, int j) {
        for ( j =j ; j > i; j--) {
            Character temp = x.charAt(j);
            if (temp.equals(y)) return true;
        }
        return false;
    }
}

