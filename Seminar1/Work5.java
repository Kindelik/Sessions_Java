package Seminar1;


public class Work5 {
    public static void main(String[] args) {
        String fraza = "Добро пожаловать на курс по Java";
        String[] arrFraza = fraza.split(" ");

        String temp;
        int count = 0;

        for (int i = 0; i < arrFraza.length / 2; i++) {
            temp = arrFraza[i];
            arrFraza[i] = arrFraza[arrFraza.length - count - 1];
            arrFraza[arrFraza.length - count - 1] = temp;
            count++;
        }
        System.out.println(String.join(" ", arrFraza));
    }
}
