package task2;

import java.util.List;

public class MutableList<T> extends AbstractList<T>{


    public MutableList(List<T> list) {
        super(list);
    }

    @Override
    public int getSize() {
        return super.getSize();
    }

    @Override
    public T get(int index) {
        return super.get(index);
    }

    public void add(T elem) {
        getList().add(elem);
    }

    public void remove(T elem) {
        getList().remove(elem);
    }

    public void set(int index, T elem) {
        getList().set(index, elem);
    }

}
