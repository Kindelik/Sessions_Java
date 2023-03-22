package HomeWork6;

import HomeWork6.Classes.Notebook;

import java.util.*;

public class Work1 {
    public static void main(String[] args) throws Exception {
        List<Notebook> list = new ArrayList<>();
        Notebook note001 = new Notebook("asus", 17.3, 2.2, "freedos", "i5-10400f", 8, 512);
        Notebook note002 = new Notebook("lenovo", 15.6, 3.3, "windows", "i7-11700k", 16, 512);
        Notebook note003 = new Notebook("hp", 17.3, 2.5, "freedos", "i5-10400f", 16, 1024);
        Notebook note004 = new Notebook("msi", 15.6, 2.7, "windows", "i9-12900k", 32, 1024);
        Notebook note005 = new Notebook("macbook", 13.3, 1.5, "macos", "m1-max", 8, 256);
        Collections.addAll(list, note001, note002, note003, note004, note005);

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
            System.out.print("""
                    
                    Введите параметры сортировки:
                    1 - Модель
                    2 - Диагональ экрана
                    3 - Масса
                    4 - Процессор
                    5 - Размер оперативной памяти
                    6 - Размер жесткого диска
                    7 - Закончить ввод данных и начать поиск
                    8 - Выйти из программы
                    =>\s""");
            int countSort = sc.nextInt();
            try {

                switch (countSort) {
                    case 1 -> {
                        System.out.println("Есть lenovo, msi, aser, macbook, hp. Введите ");
                        mapSort.put("name", sc.next());
                    }

                    case 2 -> {
                        System.out.println("Есть 13.3, 15.6, 17.3. Введите ");
                        mapSort.put("sizeDiagonal", sc.next());
                    }
                    case 3 -> {
                        System.out.println("Есть от 1.5 до 3.3. Введите ");
                        mapSort.put("weight", sc.next());
                    }
                    case 4 -> {
                        System.out.println("Есть i5-10400f, i7-11700k, i9-12900k, m1-max. Введите");
                        mapSort.put("cpu", sc.next());
                    }
                    case 5 -> {
                        System.out.println("Есть от 8 до 32 гб. Введите");
                        mapSort.put("ram", sc.next());
                    }
                    case 6 -> {
                        System.out.println("Есть от 256 до 1024 гб. Введите");
                        mapSort.put("hdd", sc.next());
                    }
                    case 7 -> {
                        System.out.println("Введенные параметры поиска\n" + mapSort+ "\n");
                        sortNotebook(list, mapSort);
                        sortSizeDiagonal(list, mapSort);
                        sortWeight(list, mapSort);
                        sortCPU(list, mapSort);
                        sortRAM(list, mapSort);
                        sortHDD(list, mapSort);
                        if (list.size() == 0) System.out.println("По вашему запросу ничего не найдено");
                        else for (Notebook item : list) System.out.println(item);
                    }
                    case 8 -> {
                        sc.close();
                        System.exit(0);
                    }
                }
            } catch (Exception e) {
                System.out.println("Введены не коректные данные");
            }
        }
    }

    public static void sortNotebook(List<Notebook> list, Map<String, String> map) {
        if (map.get("name") != null) {
            String temp = map.get("name").toLowerCase(Locale.ROOT);
            list.removeIf(item -> !temp.equals(item.getName()));
        }
    }

    public static void sortSizeDiagonal(List<Notebook> list, Map<String, String> map) {
        if (map.get("sizeDiagonal") != null) {
            double temp = Double.parseDouble(map.get("sizeDiagonal"));
            list.removeIf(item -> temp < item.getSizeDiagonal());
        }
    }

    public static void sortWeight(List<Notebook> list, Map<String, String> map) {
        if (map.get("weight") != null) {
            double temp = Double.parseDouble(map.get("weight"));
            list.removeIf(item -> temp < item.getWeight());
        }
    }

    public static void sortCPU(List<Notebook> list, Map<String, String> map) {
        if (map.get("os") != null) {
            String temp = map.get("weight").toLowerCase(Locale.ROOT);
            list.removeIf(item -> !temp.equals(item.getName()));
        }
    }

    public static void sortRAM(List<Notebook> list, Map<String, String> map) {
        if (map.get("ram") != null) {
            int temp = Integer.parseInt(map.get("ram"));
            list.removeIf(item -> temp < item.getWeight());
        }
    }

    public static void sortHDD(List<Notebook> list, Map<String, String> map) {
        if (map.get("hdd") != null) {
            int temp = Integer.parseInt(map.get("hdd"));
            list.removeIf(item -> temp < item.getWeight());
        }
    }
}




