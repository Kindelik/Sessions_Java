package Seminar4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Work1 {
    public static void main(String[] args) {
        String[] inputArr;
        String input = "text~0";
        Scanner sc = new Scanner(System.in);
        LinkedList<String> Hranilishe = new LinkedList<>();
        while (!input.equals("exit")) {
            System.out.println("Введите текст");
            input = sc.nextLine();
            inputArr = input.split("~");

            if (!inputArr[0].equals("print")) {
                if (Hranilishe.size() < Integer.parseInt(inputArr[1])) {
                    for (int i = Hranilishe.size(); i < Integer.parseInt(inputArr[1]); i++) {
                        Hranilishe.add(null);
                    }

                }
                Hranilishe.add(Integer.parseInt(inputArr[1]), inputArr[0]);
                System.out.println(Hranilishe);
            }
            else {
                System.out.println(Hranilishe.get(Integer.parseInt(inputArr[1])));
                Hranilishe.remove(Integer.parseInt(inputArr[1]));
            }
        }
    }
}
