package NinthTask;

import java.util.ArrayList;
import java.util.Collections;

public class NinthTask {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(10);
        list.add(51);
        list.add(-6);
        list.add(-5);
        list.add(3);
        list.add(-10);
        list.add(-34);
        list.add(0);
        list.add(32);
        list.add(5);
        list.add(6);
        list.add(-12);
        list.add(24);
        list.add(-52);

        Collections.reverse(list);
        System.out.println(list);
    }
}
