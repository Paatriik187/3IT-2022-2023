package PrvyPolrok;

public class Kalkulacka {

    public static void main(String[] args) {
        scitanie(5,1);
        odcitanie(1,8);
        nasobenie(2,8);
        delenie(1800,18);
    }
    static double scitanie(double x, double y){
        double z =x+y;
        System.out.println(x+" + "+y+" = "+ z);
        return z;
    }
    static double odcitanie(double x, double y){
        double z = x-y;
        System.out.println(x+" - "+y+" = "+ z);
        return z;
    }
    static double nasobenie(double x, double y){
        double z = x*y;
        System.out.println(x+" * "+y+" = "+ x*y);
        return z;
    }
    static double delenie(double x, double y){
        double z = x/y;
        if(y==0){System.out.println("Delenie nulou");}
        else {

            System.out.println(x+" / "+y+" = "+ z);

        }
        return z;
    }
}
