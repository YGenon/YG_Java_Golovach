public class Test {

    public static void main(String[] args) {


    // цикл по массивау

        int[] arr = {0,10,20,30,40};
//        System.out.print(arr.length-1);
        for (int i =arr.length -1; i >=0; i--) {
            for(int j = 0; j<=i; j++){
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
//---------------------------------------------------------------
        /** работаем с генератором случайных чисел в диапазоне

        final int min = 10; // Минимальное число для диапазона
        final int max = 75; // Максимальное число для диапазона

        for (int k = 1; k < 200; k++) {
            final int rnd = rnd(min, max);

            if (rnd == 75 || rnd == 10) System.out.print(rnd + " ,");
          //  if (rnd == 10) System.out.print(rnd + " ,");
        }
    */
    }


    /**
     * Метод получения псевдослучайного целого числа от min до max (включая max);
     */
    public static int rnd(int min, int max) {
        double my_random;
        int rezult;
        int rezult2;
        my_random = Math.random();
        max -= min;
        rezult = (int) (my_random * ++max);
        rezult2 = rezult + min;
        return rezult2;

    }

}





