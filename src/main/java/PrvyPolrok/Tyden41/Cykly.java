package PrvyPolrok.Tyden41;

public class Cykly {

    public static void main(String[] args) {

        cisla3();
        System.out.println(" ");



    }
    static void cisla () {
        int[] polecisel = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int nultyindex = polecisel[0];
        System.out.println(polecisel.length);
        for (int i = 0; i < polecisel.length; i++) {
            System.out.println(polecisel[i]);
        }
    }

    static void cisla2() {

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

    }

    static void cisla3(){
        int v =0;
        for (int i = 1; i <= 10; i++) {
            v=i+v;
        }
        System.out.println(v);

    }
}
