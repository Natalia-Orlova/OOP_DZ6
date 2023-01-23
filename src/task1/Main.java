package task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Unlocker unlocker = new Unlocker(new PIN());
        unlocker.lockUnlock();
        unlocker.lockUnlock();
    }
}
//        try (Scanner in = new Scanner(System.in)) {
//
//            while (true) {
//                System.out.println("Выберите вид разблокировки: \n");
//                System.out.println("1 - Без пароля");
//                System.out.println("2 - PIN");
//                System.out.println("3 - Отпечаток пальца");
//                System.out.println("4 - FaceID");
//                System.out.println("0 - Выход \n");
//                String key = in.next();
//                System.out.print("\033[H\033[J");
//                switch (key) {
//                    case "1":
//                        new NoPassword().unlock();
//                        break;
//                    case "2":
//                        new PIN().unlock();
//                        break;
//                    case "3":
//                        new Fingerprint().unlock();
//                        break;
//                    case "4":
//                        new FaceID().unlock();
//                        break;
//                    case "0":
//                        System.exit(0);
//                    default:
//                        System.out.println("Такой команды нет");
//                        break;
//                }
//            }
//        }