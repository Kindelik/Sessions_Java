package Seminar1;

public class Work2 {
    public static void main(String[] args) {
        int[] massiv = { 1, 1, 0, 1, 1, 1 };
        int count = 0;
        int max = 0;
        for (int j : massiv) {
            if (j > 0) {
                count += 1;
            } else {
                if (count > max) {
                    max = count;
                }
                count = 0;
            }

        }
        System.out.println(count);
    }

}
