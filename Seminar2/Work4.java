package Seminar2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Work4 {
    public static void main(String[] args) throws IOException {
//        StringBuilder slovo = new StringBuilder();
        String text = "test";
//        slovo.append(text.repeat(100));

        try (FileWriter fw = new FileWriter("file.txt", false)) {
            for (int i = 0; i < 100; i++) {
                fw.write(text + '\n');
            }
            fw.flush();

//            BufferedReader br = new BufferedReader(new FileReader("file.txt"));
//            String str;
//            while ((str = br.readLine()) != null) {
//                System.out.printf("%s \n", str);
//            }
//            br.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
