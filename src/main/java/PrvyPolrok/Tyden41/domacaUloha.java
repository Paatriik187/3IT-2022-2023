package PrvyPolrok.Tyden41;

public class domacaUloha {

    public static void main(String[] args) {

        valec(3,5);
        System.out.println( );
        elipsa(2,4);
        System.out.println( );
        trojuholnik(4,6,3,2.67);
        System.out.println( );
        sestuholnik(5);
    }

    static void valec(double r, double v){

        System.out.println("Povrch valca s vyskou "+v+" a polomerom "+r+" je "+ (2*Math.PI*r*(r+v)));

    }

    static void elipsa(double a, double b){

        System.out.println("Obsah elipsy s polomerom a "+a+" a polomerom b "+b+" je "+(Math.PI*a*b));

    }

    static void trojuholnik(double a,double b,double c, double va){

        System.out.println("Obvod trojuholnika so stranami "+a+","+b+" a "+c+" je "+ (a+b+c));
        System.out.println("Obsah trojuholnika so stranami "+a+","+b+","+c+" a vyskou "+va+" je "+ ((a*va)/2));


    }
    static void sestuholnik(double a){

        System.out.println("Obvod sestuholnika so stranou a "+a+" je "+ (6*a));
        System.out.println("Obsah sestuholnika so stranou a "+a+" je "+ (((3*Math.sqrt(3))/2)*Math.pow(a,2)));

    }
}
