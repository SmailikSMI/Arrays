import java.util.Scanner;

public class DataTimeUtils {
    public static void Year() {
        System.out.println("Введите год: ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

//        if (sc.hasNextInt()) {
//            System.out.println("Введите корректное значение");
//        }

        if (year % 4 == 0 || year % 100 == 0 && year % 400 == 0) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }
    }
}
