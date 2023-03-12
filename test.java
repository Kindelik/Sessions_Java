import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class test {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        Integer[] arr = {1,2,3,4,5,6,7,8};
        Collections.addAll(list, arr);
        System.out.println(list);
    }
}

