public class SortPuzyr {

    public static void main(String[] args){
        int[] arr = {0, 176, 10,456, 20, 1, 7, 30, 1, 40};
        int tmp;
         for (int i = arr.length -1; i >= 0; i--) {

            for(int j = 0; j<=i; j++){

             if ((arr[j] > arr[j + 1]) || (j <= i)) {
                 tmp = arr[j];
                 arr[j] = arr[j+1];
                 arr[j+1] = tmp;
             }
                for (int k = 0; k < arr.length; k++) {
                    System.out.print(arr[k] + ", ");
                }
                System.out.println("");

             }
//             System.out.println("");
         }
    }


}
