import java.util.Scanner;

public class HomeWork8 {
    public static void main(String[] args) {
        UserInputUtils.getArray();
        System.out.println("Введите номер задачи (1-это Високосный год)");
        Scanner sc = new Scanner(System.in);
        int numTask = sc.nextInt();
        switch (numTask) {
            case 1 -> DataTimeUtils.Year();
            case 2 -> {
                ArrayUtils.getAverage(UserInputUtils.array);
                System.out.println("Среднее арифметическое: " + ArrayUtils.total);
            }
            case 3 -> ArrayUtils.reverseArray(UserInputUtils.array);
            case 4 -> {
                System.out.println("Для какого числа найти индекс?");
                Scanner sca = new Scanner(System.in);
                int serchNum = sca.nextInt();
                ArrayUtils.searchNumber(UserInputUtils.array, serchNum);
            }
            case 5 -> {
                System.out.println("Введите 1 индекс для создания подмассива: ");
                Scanner scan = new Scanner(System.in);
                int leftIndex = scan.nextInt();
                System.out.println("Введите 2 индекс для создания подмассива: ");
                int rightIndex = scan.nextInt();
                ArrayUtils.getSubArray(UserInputUtils.array, leftIndex, rightIndex);
            }
        }



    }
}
