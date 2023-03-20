package Seminar6;

import Seminar6.Work2Classes.Cat;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Work3 {
    public static void main(String[] args) {


        Cat catOne = new Cat("Мурка", 6, 2.2, "Сибирская");
        Cat catTwo = new Cat("Мурка", 5, 2.2, "Сибирская");
        Cat catThree = new Cat("Барсик", 3, 4.2, "Сибирская");

        Set<Cat> unicCats = new HashSet<>();
        Collections.addAll(unicCats,catOne,catTwo,catThree);
        System.out.println(unicCats);
    }
}