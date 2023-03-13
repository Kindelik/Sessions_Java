package Homework4;

import java.util.Collections;
import java.util.LinkedList;

//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернёет «перевёрнутый» список.
public class Work1 {
    public static void main(String[] args) {
        LinkedList<Object> listL = new LinkedList<>();
        Collections.addAll(listL, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(listL);
        System.out.println(ReverseList(listL));
    }

    public static LinkedList<Object> ReverseList(LinkedList<Object> listL) {
        LinkedList<Object> listRev = new LinkedList<>();
        for (int i = listL.size()-1; i >= 0; i--) {
            listRev.add(listL.get(i));
        }
        return listRev;
    }
}

