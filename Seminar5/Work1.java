package Seminar5;

import java.util.HashMap;
import java.util.Map;

public class Work1 {
    public static void main(String[] args) {

        // Map<Character, Character> s = new HashMap<>();
        String oneStr = "fod";
        String twoStr = "bar";
        if (!iso(oneStr, twoStr)) {
            System.out.println("не изоморфны");
            System.exit(0);
        } else if (iso2(oneStr, twoStr)) {
            if (iso2(twoStr, oneStr)) {
                System.out.println("Они изоморфны");
                System.exit(0);
            } else System.exit(0);


        }

    }

    public static boolean iso(String x, String y) {

        if (x.length() != y.length()) return false;
        return true;
    }

    public static boolean iso2(String x, String y) {
        Map<Character, Character> s = new HashMap<>();
        s.put(x.charAt(0), y.charAt(0));
        for (int i = 1; i < x.length(); i++) {
            if (!s.containsKey(x.charAt(i))) {
                if (!s.get(x.charAt(i)).equals(y.charAt(i))) return false;
                s.put(x.charAt(i), y.charAt(i));
            }


        }
        return true;
    }
}
