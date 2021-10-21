package PrvyPolrok.Tyden42;

public class CyklyWhileADoWhile {

    public static void main(String[] args) {

        ukazkawhile("Patrik");
        System.out.println("---------------------------------------");
        ukazkadowhile("Patrik");

    }
    static int spolocnex=10;
    static void ukazkawhile(String meno){
        int x=spolocnex;
        while (x<=10){
            System.out.println(x+" "+meno);
            x++;
        }

    }
    static void ukazkadowhile(String meno){
        int x =spolocnex;
        do{
            System.out.println(x+" "+meno);
            x++;
        } while(x<=10);


    }
}
