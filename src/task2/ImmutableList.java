package task2;

import java.util.List;

public class ImmutableList<T> extends AbstractList<T> {

    public ImmutableList(List<T> list) {
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
}
