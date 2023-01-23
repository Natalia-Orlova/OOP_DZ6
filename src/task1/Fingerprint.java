package task1;

public class Fingerprint implements UnlockMethod{
    @Override
    public void unlock() {
        System.out.println("Приложите палец к датчику");
    }

    @Override
    public void lock() {

    }

    @Override
    public boolean getIsLocked() {
        return false;
    }
}
