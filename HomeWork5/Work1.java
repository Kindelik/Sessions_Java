package HomeWork5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
;

public class Work1 {

    public static void main(String[] args) throws IOException {


        Scanner sc = new Scanner(System.in);

        List<String> nullList = new ArrayList<>();

        Map<String, List<String>> phoneBook = new HashMap<>();

        while (true) {
            System.out.print("Введите Имя или exit для выхода: ");
            String name = sc.next();
            if (name.equals("exit")) {
                System.out.println(phoneBook);
                return;
            }
            System.out.print("Введите номер или exit для выхода: ");
            String phone = sc.next();
            if (phone.equals("exit")) {
                System.out.println(phoneBook);
                return;
            }
            phoneBook.putIfAbsent(name, nullList);
            for (String key : phoneBook.keySet()) {
                if (name.equals(key)) {
                    List<String> temp = new ArrayList<>(phoneBook.get(name));
                    temp.add(phone);
                    phoneBook.put(name, temp);
                }
            }
        }
    }
}



