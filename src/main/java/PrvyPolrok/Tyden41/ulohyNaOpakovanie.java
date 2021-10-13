package PrvyPolrok.Tyden41;

public class ulohyNaOpakovanie {

    public static void main(String[] args) {

        uloha1();
        System.out.println("------------------------------------------------------");
        uloha2();
        System.out.println("------------------------------------------------------");
        uloha3();
        System.out.println("------------------------------------------------------");
        objemValca(2,4);
        System.out.println("------------------------------------------------------");

    }
    static void uloha1(){

        System.out.println("toto sa spusti len vtedy ked sa zavola metoda uloha1");

    }


    static void uloha2(){

        int Tomas = 40;
        int Timo = 23;
        int i = Tomas + Timo;
        int o = Tomas - Timo;
        int l = Tomas*Timo;
        double a = (double)Tomas/Timo;
        int m = Tomas%Timo;
        System.out.println("Scitanie "+ i);
        System.out.println("Odcitanie "+ o);
        System.out.println("Nasobenie "+ l);
        System.out.println("Delenie "+ a);
        System.out.println("Modulo "+ m);


    }
    static void uloha3(){

        int cislo1 = 40;
        int cislo2 = 23;
        boolean ls = cislo1>cislo2;
        boolean sk = cislo2>cislo1;
        boolean sl = cislo1!=cislo2;

        System.out.println("Je cislo1 vacsie ako cislo 2? "+ls);
        System.out.println("Nerovna sa cislo1 cislu2 ?"+sl);
        System.out.println("Je cislo2 vacsie ako cislo1? "+sk);
    }

    static void objemValca(double polomer,double vyska){


        System.out.println("Objem valca je "+ (Math.PI *(polomer*polomer)*vyska));



    }
}
