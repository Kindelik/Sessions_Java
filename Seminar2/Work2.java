package Seminar2;

public class Work2 {
    public static void main(String[] args) {

        String inputTxt = "aaaabbbcdd";

        int count = 1;
        char[] simvolTxt = inputTxt.toCharArray();
        StringBuilder inputTxtSB = new StringBuilder();

        for (int i = 0; i < inputTxt.length() - 1; i++) {
            if (simvolTxt[i] == simvolTxt[i + 1]) {
                count++;
            } else {
                String countString = String.valueOf(count);
                inputTxtSB.append(String.valueOf(count)).append(simvolTxt[i]);
                count = 1;
            }

        }
        inputTxtSB.append(String.valueOf(count)).append(simvolTxt[inputTxt.length() - 1]);
        System.out.println(inputTxtSB);
    }
}
