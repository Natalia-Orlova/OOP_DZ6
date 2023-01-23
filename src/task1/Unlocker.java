package task1;

public class Unlocker {
    private UnlockMethod unlockMethod;

    public Unlocker(UnlockMethod unlockMethod) {
        this.unlockMethod = unlockMethod;
    }

    public void lockUnlock() {
        if (unlockMethod.getIsLocked()) {
            unlockMethod.unlock();
        }
        else unlockMethod.lock();
    }
}
