package HomeWork2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.*;


//Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
public class Work2 {
    public static void main(String[] args) throws IOException {

        Logger logHW2 = Logger.getLogger(Work2.class.getName());
        FileHandler fileHW2 = new FileHandler("HomeWork2/logHW2.txt",true);
        logHW2.addHandler(fileHW2);
        List<Integer> listInt = new ArrayList<>();
        SimpleFormatter sFormat = new SimpleFormatter();
        fileHW2.setFormatter(sFormat);
        logHW2.setUseParentHandlers(true); // вывод логов в терминал, true and false
        for (int i = 0; i < 10; i++) {
            listInt.add(new Random().nextInt(0, 100));
        }
        logHW2.info("массив до сортировки: " + listInt);
        for (int i = 0; i < listInt.size(); i++) {
            for (int j = 0; j < listInt.size() - 1; j++) {
                int temp;
                if (listInt.get(j) > listInt.get(j + 1)) {
                    temp = listInt.get(j + 1);
                    listInt.set(j+1,listInt.get(j)) ;
                    listInt.set(j,temp);
                }
            }
            logHW2.info("Проход №"+ (i+1) + " Массив: " + listInt);
        }
        logHW2.info("Сортировка окончена");
    }
}
