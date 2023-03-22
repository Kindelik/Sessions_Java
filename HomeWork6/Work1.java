package HomeWork6;

import HomeWork6.Classes.Notebook;

import java.util.*;

public class Work1 {
    public static void main(String[] args) {
        List<Notebook> list = new ArrayList<>();
        Notebook note001 = new Notebook("ASUS", 17.3, 2.2, null, "i5-10400f", 8, 512);
        Notebook note002 = new Notebook("Lenovo", 15.6, 3.3, "Windows 11", "i7-11700k", 16, 512);
        Notebook note003 = new Notebook("HP", 17.3, 2.5, null, "i5-10400f", 16, 1024);
        Notebook note004 = new Notebook("MSI", 15.6, 2.7, "Windows 10", "i9-12900k", 32, 1024);
        Notebook note005 = new Notebook("MacBook", 13.3, 1.5, "MacOS", "m1-max", 8, 256);
        Collections.addAll(list, note001, note002, note003, note004, note005);
        System.out.println(note001);

        Scanner sc = new Scanner(System.in);

        Map<String, String> mapSort = new HashMap<>();
        mapSort.put("name", null);
        mapSort.put("sizeDiagonal", null);
        mapSort.put("weight", null);
        mapSort.put("os", null);
        mapSort.put("cpu", null);
        mapSort.put("ram", null);
        mapSort.put("hdd", null);
        while (true) {
            System.out.println("Введите параметры сортировки:\n" +
                    "1 - Модель\n" +
                    "2 - Диагональ экрана\n" +
                    "3 - Масса\n" +
                    "4 - Операционная система\n" +
                    "4 - Процессор\n" +
                    "5 - Размер оперативной памяти\n" +
                    "6 - Размер жесткого диска\n" +
                    "7 - Закончить ввод данных и начать поиск\n" +
                    "=> ");
            int countSort = sc.nextInt();

            switch (countSort) {
                case 1 -> {
                    System.out.println("Введите");
                    mapSort.put("name", sc.next());
                }

                case 2 -> {
                    System.out.println("Введите");
                    mapSort.put("sizeDiagonal", sc.next());
                }
                case 3 -> {
                    System.out.println("Введите");
                    mapSort.put("weight", sc.next());
                }
                case 4 -> {
                    System.out.println("Введите");
                    mapSort.put("cpu", sc.next());
                }
                case 5 -> {
                    System.out.println("Введите");
                    mapSort.put("ram", sc.next());
                }
                case 6 -> {
                    System.out.println("Введите");
                    mapSort.put("hdd", sc.next());
                }
                case 7 -> {
                    System.out.println(mapSort);
                    sortNotebook(list, mapSort);

                }

            }
        }
    }
    public static void sortNotebook(List<Notebook> list, Map<String, String> map) {
        for (Map.Entry<String, String> item : map.entrySet()) {
            System.out.printf("Key: %d  Value: %s \n", item.getKey(), item.getValue());

        }
    }
}




