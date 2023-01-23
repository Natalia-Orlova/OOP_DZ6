package task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        AbstractList<Integer> abstractList = new AbstractList<>(list);
        ImmutableList<Integer> immutableList = new ImmutableList<>(list);
        MutableList<Integer> mutableList = new MutableList<>(list);


        System.out.println(abstractList + "Size = " + abstractList.getSize() + "\n");
        System.out.println(immutableList + "Size = " + immutableList.getSize());
        System.out.println("3-й элемент ImmutableList: " + immutableList.get(2) + "\n");

        mutableList.add(300);
        mutableList.add(5);
        mutableList.remove(1);

        System.out.println(mutableList + "Size = " + mutableList.getSize() + "\n");

        mutableList.clear();

        System.out.println("очистили MutableList: \n" + mutableList);









    }
}
