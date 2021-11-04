package PrvyPolrok;

public class Kalkulacka {

    public static void main(String[] args) {
        scitanie(0.9,1);
        odcitanie(1,8);
        nasobenie(5,57);
        delenie(1800,18);
    }
    static void scitanie(double x, double y){
        System.out.println(x+y);
    }
    static void odcitanie(double x, double y){
        System.out.println(x-y);
    }
    static void nasobenie(double x, double y){
        System.out.println(x*y);
    }
    static void delenie(double x, double y){
        if(y==0){System.out.println("Delenie nulou");}
        else {
            System.out.println(x / y);
        }
    }
}
