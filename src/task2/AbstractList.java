package task2;

import java.util.ArrayList;
import java.util.List;

public class AbstractList<T> {
    private List<T> list;

    public AbstractList(List<T> list) {
        this.list = list;
    }

    public int getSize() {
        return list.size();
    }

    public T get(int index) {
        return list.get(index);
    }

    public ArrayList<T> getList() {
        ArrayList<T> copy = new ArrayList<>();
        copy.addAll(0,list);
        return copy;
    }

    @Override
    public String toString() {
        return "AbstractList[" + list + "]";
    }
}
