package task2;

import java.util.List;

public class AbstractList<T> {
    private List<T> list;

    public AbstractList(List<T> list) {
        this.list = list;
    }

    public List<T> getList() {
        return list;
    }

    public int getSize() {
        return list.size();
    }

    public T get(int index) {
        return list.get(index);
    }


}
