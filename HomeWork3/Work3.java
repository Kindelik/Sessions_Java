package HomeWork3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//  Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
public class Work3 {
    public static void main(String[] args) {

        List<Integer> listInt = new ArrayList<>();
        int index = 20;  // количество нужных элементов в листе
        int minValue = 0;  // левый край рандома
        int maxValue = 100;  // правый край рандома
        listIntRandom(listInt, index, minValue, maxValue);  // метод создания рандомного листа
        System.out.println(listInt);

        int minList = minList(listInt);      //метод поиска минимума в листе
        int maxList = maxList(listInt);      //метод поиска максимума в листе
        double meanList = meanList(listInt);   // метод поиска среднего арифметического в листе

        System.out.printf(" Минимальное значение  в листе: %d\n Максимальное значение в листе: %d\n" +
                " Среднее арифметическое значение листа: %.2f", minList,maxList,meanList);


    }

    public static void listIntRandom(List<Integer> listInt, int index, int minValue, int maxValue) {

        for (int i = 0; i < index; i++) {
            listInt.add(new Random().nextInt(minValue, maxValue));
        }
    }

    public static int minList(List<Integer> listInt) {
        int minValue = listInt.get(0);
        for (int i = 1; i < listInt.size(); i++) {
            if (listInt.get(i) < minValue) minValue = listInt.get(i);
        }
        return minValue;
    }

    public static int maxList(List<Integer> listInt) {
        int maxValue = listInt.get(0);
        for (int i = 1; i < listInt.size(); i++) {
            if (listInt.get(i) > maxValue) maxValue = listInt.get(i);
        }
        return maxValue;
    }

    public static double meanList(List<Integer> listInt) {
        double sumValue = 0;
        double meanValue;
        for (int i = 0; i < listInt.size(); i++) sumValue += listInt.get(i);
        meanValue = sumValue/listInt.size();
        return meanValue;

    }
}


