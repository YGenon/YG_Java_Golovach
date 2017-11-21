public class RecursOut {
    public static void main(String[] args) {
        f(1);

    }

    public static void f(int x) {

        System.out.print( (int) RandomNumber.rnd_diapozon(180, 200) + ", ");

        if (x < 1450) {
            f(x * 2);
        }
        System.out.print(" " + x);



    }

}
