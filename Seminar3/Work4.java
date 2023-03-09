package Seminar3;

import java.util.ArrayList;
import java.util.List;

public class Work4 {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();
        arr.add("Venera");
        arr.add("12");
        arr.add("Mercury");
        arr.add("100");
        arr.add("Mars");
        arr.add("Saturn");
        arr.add("Jupiter");
        arr.add("Neptune");
        arr.add("1000");
        arr.add("Uran");
        arr.add("11111");
        System.out.println(arr);

       int i = 0;
       while (i<arr.size()){
           if(!tryParce(arr.get(i))){
               arr.remove(i);
           }
           i++;
        }
        System.out.println(arr);
    }

    static boolean tryParce(String st){
        try{
            Integer.parseInt(st);
        }
        catch (NumberFormatException e){
            return true;
        }
        return false;
    }

}
