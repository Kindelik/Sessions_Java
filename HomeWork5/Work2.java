package HomeWork5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
Пусть дан список сотрудников:

        Иван Иванов
        Светлана Петрова
        Кристина Белова
        Анна Мусина
        Анна Крутова
        Иван Юрин
        Петр Лыков
        Павел Чернов
        Петр Чернышов
        Мария Федорова
        Марина Светлова
        Мария Савина
        Мария Рыкова
        Марина Лугова
        Анна Владимирова
        Иван Мечников
        Петр Петин
        Иван Ежов

        Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.
*/
public class Work2 {
    public static void main(String[] args) throws FileNotFoundException {
        Map<String,String> staff = new HashMap<>();
        String tempWriter;

        try {
            BufferedReader br = new BufferedReader(new FileReader("HomeWork5/Staff.txt"));
            while ((tempWriter = br.readLine())!= null){
                String[] tempWrArr = tempWriter.split(" ");
                staff.putIfAbsent(tempWrArr[1],tempWrArr[0]);
            }

        }
        catch (Exception e){
            System.out.println("Файл не найден");
            System.exit(0);
        }
        System.out.println(staff);
        String[] nameStr = staff.values().toArray(new String[0]);
        System.out.println(Arrays.toString(nameStr));

    }
}
