public class ArrayUtils {


    //    public static int [] array;
    public static double total = 0;


    //    public static int[] getArray (){
//        System.out.println("Введите длинну массива:");
//        Scanner sc = new Scanner(System.in);
//        int sizeArray = sc.nextInt();
//        array = new int[sizeArray];
//        System.out.println("Введите значения массива(через пробел):");
//        for (int i = 0; i < sizeArray;i++)
//        {
//            array[i]=sc.nextInt();
//        }
//        System.out.println("Ваш массив: ");
//        System.out.println(Arrays.toString(array));
//
//        return array;
//
//    }
    public static double getAverage(int[] array) {
        for (int i : array) {
            total = total + i;
        }
        total = total / array.length;
        return total;
    }

    public static void reverseArray(int[] array) {

        System.out.print("[");
        for (int i = array.length - 1; i != -1; i--) {

            System.out.print(array[i] + ",");

        }
        System.out.print("]");
    }

    public static int searchNumber(int[] array, int serchNum) {
        for (int i = 0; i < array.length; i++) {
            if (serchNum == array[i]) {
                System.out.println("Индекс искомого числа: " + i);
                return 0;
            }
        }
        return -1;
    }


    public static int[] getSubArray(int[] array,int leftIndex,int rightIndex) {
        System.out.print("[");
        for (int i = leftIndex; i < rightIndex; i++) {

            System.out.print(array[i] + ", ");
        }
        System.out.print("]");

        return array;
    }
}










