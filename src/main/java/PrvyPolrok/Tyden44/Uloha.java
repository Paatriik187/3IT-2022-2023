package PrvyPolrok.Tyden44;

public class Uloha {

    public static void main(String[] args) {
        int[] pole = new int[]{1, -2, 8, 2, -5, -4};
        priemer(pole);
    }
    static double priemer(int[] pole) {
        double x = 0;
        for(int y=0; y<pole.length; y++){

            x=x+pole[y];
            int w=pole[y];
        }
        x=x/pole.length;
        System.out.println("Priemer cisel ");
        for(int y=0; y<pole.length; y++){
            System.out.println(pole[y]);
        }
        System.out.println(" je "+x);
        return x;
    }
}
