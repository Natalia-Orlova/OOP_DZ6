package task1;

public class FaceID implements UnlockMethod{
    @Override
    public void unlock() {
        System.out.println("Посмотрите в камеру");
    }

    @Override
    public void lock() {

    }

    @Override
    public boolean getIsLocked() {
        return false;
    }
}
