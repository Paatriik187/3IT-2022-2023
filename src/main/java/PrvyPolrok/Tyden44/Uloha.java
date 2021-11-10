package PrvyPolrok.Tyden44;

public class Uloha {

    public static void main(String[] args) {
        int[] pole = new int[]{1, 22, 3, 2, 9, 5};
        priemer(pole);
    }

    static double priemer(int[] pole) {
        double x = 0;
        for(int y=0; y<pole.length; y++){

            x=x+pole[y];
            int w=pole[y];
        }
        x=x/pole.length;
        System.out.println("Priemer cisel "+pole[1]+","+pole[2]+","+pole[3]+","+pole[4]+","+pole[5]+" je "+x);
        return x;
    }
}
