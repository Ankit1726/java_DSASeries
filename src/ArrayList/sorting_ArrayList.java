package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class sorting_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(7);
        list.add(8);
        list.add(5);

        System.out.println("list in Ascending list");
        Collections.sort(list);
        System.out.println(list);

        System.out.println("list in Descending list");
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}
