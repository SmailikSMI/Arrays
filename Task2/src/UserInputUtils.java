import java.util.Arrays;
import java.util.Scanner;

public class UserInputUtils {
    public static int [] array;
    public static int[] getArray (){
        System.out.println("Введите длинну массива:");
        Scanner sc = new Scanner(System.in);
        int sizeArray = sc.nextInt();
        array = new int[sizeArray];
        System.out.println("Введите значения массива(через пробел):");
        for (int i = 0; i < sizeArray;i++)
        {
            array[i]=sc.nextInt();
        }
        System.out.println("Ваш массив: ");
        System.out.println(Arrays.toString(array));

        return array;

    }
}
