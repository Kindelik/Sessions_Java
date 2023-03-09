package Seminar3;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Work2 {
    public static void main(String[] args) {
        Random r = new Random();
        List<Integer> listInt = new ArrayList();

        for (int i = 0; i < 10; i++) {

            listInt.add(r.nextInt(0,100));
        }
        Collections.sort(listInt);
        System.out.println(listInt);

    }



}
