package PrvyPolrok.Tyden2;

import java.util.Arrays;
import java.util.Locale;

public class Opakovanie {

    public static void main(String[] args) {
        int a = 49;
        float s = 59;
        double p = 7895;
        long q = 99456616549L;
        byte m = 2;
        short x = 9;
        String Ps = "Standa";
        char l = 'f';
        int sa = 5;
        meno();
        boolean[] hil = new boolean[10];
        int[] ak = new int[5];
        System.out.println(Arrays.toString(hil));
        System.out.println(Arrays.toString(ak));
        meno();

    }
    static void meno(){

        String no = "Never gonna give you up";
        for (int x =0;x<no.length();x++){
            String up = no.toUpperCase();
            char test = up.charAt(x);
            System.out.println(no.charAt(x));
        }
        int i = 7;
        int z;
        z=4+i++-2+ ++i+i;
        System.out.println(z);
        System.out.println(i);

    }
}
//main metoda a a na co sluzi
//rozdiel medzi triedou a balickom
//syntax triedy
//aritmeticke operacie s int long double
//logicke operacie | a &
//vetvenie kodu (if,else)