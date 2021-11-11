package PrvyPolrok.Tyden45;

import java.util.Arrays;

public class polia {

    public static void main(String[] args) {
        osemPoli();
    }
    static void osemPoli(){

        int[] pole =new int[5];
        double[] poledva=new double[5];
        short[] poletri=new short[5];
        byte[] polestyri=new byte[5];
        float[] polepat=new float[5];
        long[] polesest=new long[5];
        char[] polesedem=new char[5];
        String[] poleosem=new String[5];
        int[] cisla =new int[] {69,42,0,55,485,333,1598,5,444444444,-25};
         int vysledok1 = Arrays.binarySearch(cisla,55);
         System.out.println(vysledok1);
        Arrays.sort(cisla);
        int vysledok2 = Arrays.binarySearch(cisla,55);
        System.out.println(vysledok2);
        System.out.println(Arrays.toString(cisla));
        System.out.println(cisla.toString());
    }
}
