package PrvyPolrok.Tyden49;

public class vytvorenieMetod {

    public static void main(String[] args) {
        premenne();
    }

    static void metoda1 (int x){

    }

    static String metoda2(int x,String y){
        return y;
    }

    static String metoda3 (boolean x, String y, int z){

        return y;
    }
    static long metoda4(){
        return 456;
    }
    static String[] metoda5(int[] x){
        String[] a = new String[] {"x","dsad","fasd"};
        return a;
    }
    static void metoda6(boolean[]x,int y){

    }
    static boolean metoda7(String s,long a,char l){
        return true;
    }
    static float metoda8(float a){
        return 4;
    }
    static boolean[] metoda9(){
        boolean[] x = new boolean[]{true,true,false};
        return x;
    }
    static void metoda10(boolean x){

    }
    static void premenne(){

        int a = 45;
        boolean b = false;
        long c = 46546465L;
        String d = "Patrik";
        float e = 5;
        double f = 6886;
        char g = 'a';

        int[] h = new int[]{4,6,7,1,6};
        for(int x=0;x<h.length;x++){
            System.out.println("int = "+h[x]);
        }

        String[] i = new String[]{"QWERTZUIOP","ASDFGHJKL","YXCVBNM"};
        for(int x=0;x<i.length;x++){
            System.out.println("String = "+i[x]);
        }

        char[] j = new char[]{'a','b','c'};
        for(int x=0;x<j.length;x++){
            System.out.println("char = "+j[x]);
        }

        boolean[] k = new boolean[]{true,false,false};
        for(int x=0;x<k.length;x++){
            System.out.println("boolean = "+k[x]);
        }

        float[] l = new float[]{4.156f,6.85f,8.1f,2.455f};
        for(int x=0;x<l.length;x++){
            System.out.println("float = "+l[x]);
        }

        long[] m = new long[]{44648L,4646486453L,87987946L};
        for(int x=0;x<m.length;x++){
            System.out.println("long = "+m[x]);
        }
    }
}
