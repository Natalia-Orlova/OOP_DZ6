package task1;

public class NoPassword implements UnlockMethod {

    @Override
    public void unlock() {
        System.out.println("Телефон разблокирован\n");
    }

    @Override
    public void lock() {

    }

    @Override
    public boolean getIsLocked() {
        return false;
    }
}
