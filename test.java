import java.util.HashMap;
import java.util.Map;

public class test {
    public static void main(String[] args) {
        Map<String, String> states = new HashMap<>();
        String somiStr = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        StringBuilder outStr = new StringBuilder();
        String newInputStr = somiStr.replaceAll("[\"{}]", "");
        System.out.println(newInputStr);
        String[] newInputStrArr = newInputStr.split(",");
        for (String item: newInputStrArr
             ) {

        }
    }
}

