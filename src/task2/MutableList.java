package task2;

import java.util.ArrayList;
import java.util.List;

public class MutableList<T> {
    private List<T> list;
    private AbstractList<T> abstractList;

    public MutableList(List<T> list) {
        this.list = new ArrayList<>(list);
    }

    public int getSize() {
        return this.list.size();
    }

    public T get(int index) {
        return this.list.get(index);
    }

    public void add(T elem) {
        this.list.add(elem);
    }

    public void remove(int index) {
        this.list.remove(index);
    }

    public void set(int index, T elem) {
        this.list.set(index, elem);
    }

    public void clear() {
        this.list.clear();
    }

    @Override
    public String toString() {
        return "MutableList[" + this.list + "]";
    }
}
