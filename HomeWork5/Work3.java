package HomeWork5;

import java.util.Arrays;

public class Work3 {
    public static void main(String[] args) {
        int[][] pole = new int[8][8];
        int x = 0;
        int y = 0;
        int count = 1;
        while (count < 8) {
            count =1;
            // Очистка поля
            for (int[] ints : pole) {
                Arrays.fill(ints, 0);
            }
            // установка первой фигуры
            pole[x][y] = 2;
            rightAndLeft(pole, x, y);
            upAndDown(pole, x, y);
            diagonal(pole, x, y);
           // System.out.printf("pole[%d][%d] = %d\n", x, y, pole[x][y]);
            //поиск места для новой фигуры
            for (int i = 0; i < pole.length; i++) {
                for (int j = 0; j < pole[i].length; j++) {
                    if (pole[i][j] == 0) {
                        pole[i][j] = 2;
                        count++;
                        //System.out.printf("pole[%d][%d] = %d\n", i, j, pole[i][j]);
                        rightAndLeft(pole, i, j);
                        upAndDown(pole, i, j);
                        diagonal(pole, i, j);
                    }
                }

            }

            if (count < 8) {
                y++;
                if (x == 8 & y == 8) System.exit(404);
                if (y == 8) {
                    y = 0;
                    x++;

                }
            }
        }
        printTwoArr(pole);
        System.out.println();
    }


    public static void printTwoArr(int[][] mas) {
        for (int[] item : mas) System.out.println(Arrays.toString(item));
    }

    public static void rightAndLeft(int[][] mas, int i, int j) {
        for (int k = j; k < mas.length; k++) {
            if (mas[i][k] == 0) mas[i][k] = 1;
        }
        for (int k = j; k >= 0; k--) {
            if (mas[i][k] == 0) mas[i][k] = 1;
        }
        // printTwoArr(mas);
    }

    public static void upAndDown(int[][] mas, int i, int j) {
        for (int k = i; k < mas[i].length; k++) {
            if (mas[k][j] == 0) mas[k][j] = 1;
        }
        for (int k = i; k >= 0; k--) {
            if (mas[k][j] == 0) mas[k][j] = 1;
        }
    }

    public static void diagonal(int[][] mas, int i, int j) {
        int i2 = i;
        int j2 = j;
        while (i2 >= 0 & j2 >= 0) {
            if (mas[i2][j2] == 0) mas[i2][j2] = 1;
            i2--;
            j2--;
        }
        i2 = i;
        j2 = j;
        while (i2 < mas.length & j2 < mas[i].length) {
            if (mas[i2][j2] == 0) mas[i2][j2] = 1;
            i2++;
            j2++;
        }
        i2 = i;
        j2 = j;
        while (i2 >= 0 & j2 < mas[i].length) {
            if (mas[i2][j2] == 0) mas[i2][j2] = 1;
            i2--;
            j2++;
        }
        i2 = i;
        j2 = j;
        while (i2 < mas.length & j2 >= 0) {
            if (mas[i2][j2] == 0) mas[i2][j2] = 1;
            i2++;
            j2--;
        }
    }

}

