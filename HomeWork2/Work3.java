package HomeWork2;

//    Дана json строка (можно сохранить в файл и читать из файла)
//            [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
//            Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
//            Пример вывода:
//            Студент Иванов получил 5 по предмету Математика.
//            Студент Петрова получил 4 по предмету Информатика.
//            Студент Краснов получил 5 по предмету Физика.


import netscape.javascript.JSObject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Work3 {

    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("homeWork2/HW3.json");
        // Scanner iScanner = new Scanner(fr);
        //System.out.println(iScanner);
        // StringBuilder str = new StringBuilder();
        String str;
        List<String> strArr = new ArrayList<>();
        // String texts = iScanner.nextLine();
        // String[] newLine = texts.split("}");
        //  System.out.println(Arrays.toString(newLine));


        BufferedReader file = new BufferedReader(fr);
        while ((str = file.readLine()) != null) strArr.add(str);
        System.out.println(strArr);

    }

}
      /*  Map<Integer, String> states = new HashMap<Integer, String>();
        states.put(1, "Germany");
        states.put(2, "Spain");
        states.put(4, "France");
        states.put(3, "Italy");

        // получим объект по ключу 2
        String first = states.get(2);
        System.out.println(first);
        // получим весь набор ключей
        Set<Integer> keys = states.keySet();
        // получить набор всех значений
        Collection<String> values = states.values();
        //заменить элемент
        states.replace(1, "Poland");
        // удаление элемента по ключу 2
        states.remove(2);
        // перебор элементов
        for (Map.Entry<Integer, String> item : states.entrySet()) {

            System.out.printf("Key: %d  Value: %s \n", item.getKey(), item.getValue());
        }

        Map<String, Person> people = new HashMap<String, Person>();
        people.put("1240i54", new Person("Tom"));
        people.put("1564i55", new Person("Bill"));
        people.put("4540i56", new Person("Nick"));

        for (Map.Entry<String, Person> item : people.entrySet()) {

            System.out.printf("Key: %s  Value: %s \n", item.getKey(), item.getValue().getName());
        }
    }
}

class Person {

    private String name;

    public Person(String value) {

        name = value;
    }

    String getName() {
        return name;
    }
}
*/