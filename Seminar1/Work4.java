package Seminar1;

public class Work4 {
    public static void main(String[] args) {

        String[] arr = {"котел", "котенок", "котлован", "котовский"}; // "asdfah".hasPostfix("f") -> true
        String result = "";
        int min = arr[0].length();
        char temp;
        for (String item : arr) {
            if (item.length() < min) min = item.length();
        }
        for (int i = 0; i < min; i++) {
            temp = arr[0].charAt(i); // посимвольно шагаем
            for (String s : arr) {
                if (s.charAt(i) != temp) {
                    System.out.println(result);
                    return;
                }
            }
            result += temp;
        }
        System.out.println(result);
    }
}


