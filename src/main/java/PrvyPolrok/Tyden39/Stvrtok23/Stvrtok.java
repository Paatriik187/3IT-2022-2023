package PrvyPolrok.Stvrtok23;

public class Stvrtok {

    public static void main(String[] args) {

        int r = 5;
        double x = 3.475;
        long  y = 3_181_529_148L;
        int z = 0x48AE;
        int e = 0b1010111;

        System.out.println(r);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(e);
        System.out.println("----------------------------");

        int s1 =1;

        int s2 = 1;

        System.out.println("s1 sa rovna "+ s1 +",Vysledok " + s1++*2);

        System.out.println("s2 sa rovna "+ s2 +",Vysledok " + ++s2*2);

    }
}