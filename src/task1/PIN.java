package task1;

import java.util.Scanner;

public class PIN implements UnlockMethod {
    private boolean isLocked;
    private int pin = 1234;
    @Override
    public void unlock() {
        isLocked = false;
        System.out.println("Введите пароль из 4 цифр");
        Scanner sc = new Scanner(System.in);
        while (sc.nextInt() != pin) {
            System.out.println("Неверный пароль, повторите попытку\n");
        }
        System.out.println("Телефон разблокирован\n");
    }

    @Override
    public void lock() {
        isLocked = true;
        System.out.println("Телефон заблокирован!\n");
    }

    @Override
    public boolean getIsLocked() {
        return isLocked;
    }


}
