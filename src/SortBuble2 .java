import java.lang.reflect.Array;
import java.util.Arrays;

public class SortBubble {

    public static void main(String[] args){

        int[] arr = {556, 34, 56, 0, 176, 10, 456, 20, 1, 7, 30, 1, 40};
        /** tmp - временная переменная через которую меняем местами элементы массива */
        int tmp;

        for (int i =arr.length -1; i >=0; i--) {
            for(int j = 0; j<=i; j++) {

                if (j != i) {
                    if (arr[j] > arr[j + 1]) {
                        tmp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = tmp;
                    }
                }
            }
        }
            /** вывод содержимого массива*/
            System.out.println (Arrays.toString(arr));
//          for (int k = 0; k < arr.length; k++) {
//              System.out.print(arr[k] + ", ");
//          }
    }


}
