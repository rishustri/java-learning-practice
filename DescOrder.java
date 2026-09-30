import java.util.*;

public class DescOrder {
    public static void main(String[] args) {

        ArrayList<Integer> list =
                new ArrayList<>();

        list.add(50);
        list.add(20);
        list.add(70);
        list.add(10);

        Collections.sort(list,
                Collections.reverseOrder());

        System.out.println(list);
    }
}