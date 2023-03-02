package Seminar1;

import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * Work1
 */
public class Work1 {
    public static void main(String[] args) {
        System.out.println("Hello_word");
        LocalDateTime nowDate = LocalDateTime.now();
        System.out.println(nowDate);
        System.out.println(LocalDateTime.now().getDayOfYear());
        int startSecond = LocalDateTime.now().getSecond();
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите свое имя: ");
        String nameUser = sc.nextLine();
        System.out.println("Hello, " + nameUser);
        System.out.print("Введите число x:");
        int x = sc.nextInt();
        System.out.print("Введите число y:");
        int y = sc.nextInt();
        System.out.printf("%d + %d = %d", x, y, x + y);
        int endSecond = LocalDateTime.now().getSecond();
        System.out.println();
        System.out.printf("%d, %d, %d",startSecond, endSecond, endSecond - startSecond);
        sc.close();
    }

}