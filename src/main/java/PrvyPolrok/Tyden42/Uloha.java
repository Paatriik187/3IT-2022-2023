package PrvyPolrok.Tyden42;

public class Uloha {
    static int rok = 2012;
    public static void main(String[] args) {
        prestupnyrok(rok);
        System.out.println("-----------");
        parnyrok(rok);

    }

    static void prestupnyrok(int rok){

        boolean prestupny = false;
        if (rok % 4 == 0){
            if (rok % 100 == 0){
                if (rok % 400 == 0){
                    prestupny = true;
                }
                else{
                    prestupny = false;
                }
            }
            else{
                prestupny = true;
            }
        }
        else{
            prestupny = false;
        }
        if (prestupny==true){
            System.out.println("Rok "+rok+" je prestupny");
        }
        else{
            System.out.println("Rok "+rok+" nie je prestupny");
        }

    }

    static void parnyrok(int rok){

        if(rok % 2==0){
            System.out.println("Rok "+rok+" je parny");
        }
        else{
            System.out.println("Rok "+rok+" je neparny");
        }
    }
}
