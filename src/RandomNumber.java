public class RandomNumber {


    public static double rnd(final double max)
    {
        double k;
        k = Math.random() * max;
       /* System.out.println(k); */
        return  k;

    }

    public static int rnd_diapozon(int min, int max)
    {
       // int temp;
        max -= min;
       // temp = ++max ;
        return (int) (++max * Math.random()) + min;

    }
    }

