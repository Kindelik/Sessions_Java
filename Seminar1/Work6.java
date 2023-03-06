package Seminar1;

import java.util.Scanner;

public class Work6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число\n => ");
        double a = sc.nextDouble();
        System.out.print("Введите степень\n => ");
        double b = sc.nextDouble();
        sc.close();
        System.out.printf("%.2f",Math.pow(a,b));
    }
}
