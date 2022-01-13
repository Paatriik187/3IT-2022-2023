package PrvyPolrok.Tyden2;

import java.util.Arrays;

public class poleuzzase {

    public static void main(String[] args) {
        System.out.println(parnecisla(new int[]{465,7,8965,4,864,5,78,4,48,65,7,2,8,4,79}));

    }
    public static void Ulohy(){
        boolean[] bol = new boolean[5];
        int[] in = new int[5];
        char[] cg = new char[5];
        String[] a = new String[5];
        byte[] b = new byte[5];
        long[] l = new long[5];
        System.out.println(Arrays.toString(bol));
        System.out.println(Arrays.toString(in));
        System.out.println(Arrays.toString(cg));
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(l));
    }
    public static int Patriks(int[]a){
        int max =0;
        for (int x =0;x<a.length;x++){
            if(a[x]>max){
                max=a[x];
            }
        }
        return max;
    }
    public static String parnecisla(int[] p){
        int neparne = 0;
        int parne = 0;
        for (int x = 0;x<p.length;x++){
            if(p[x]%2==0){
                parne++;
            }
            else{
                neparne++;
            }
        }

        return "Parne cisla:"+parne+" neparne cisla:"+neparne;
    }
}