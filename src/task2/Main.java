package task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6);

        AbstractList<Integer> abs = new AbstractList<>(list);

        ImmutableList<Integer> immutableList = new ImmutableList<>(list);

        MutableList<Integer> mutableList = new MutableList<>(list);








    }
}
