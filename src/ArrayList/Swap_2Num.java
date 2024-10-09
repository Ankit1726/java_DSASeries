package ArrayList;

import java.util.ArrayList;
public class Swap_2Num {
    public static void swap(ArrayList<Integer> list,int idx1,int idx2){
        int temp = list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(7);
        list.add(8);
        list.add(5);
        System.out.println("Original List.....");
        System.out.println(list);
        int idx1 = 1,idx2 = 3;
        System.out.println("List after Reversing....");
        swap(list,idx1,idx2);
        System.out.println(list);


    }
}
