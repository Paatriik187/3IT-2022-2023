package PrvyPolrok.Tyden42;

public class vetvenieKodu {

    public static void main(String[] args) {

        Mojemeno("Patrik Smolicek");
    }
    public static void Mojemeno(String meno){

        if (meno.length()>10){
            System.out.println("Moje meno je dlhsie ako 10 znakov");
        }
        else {
            System.out.println("Moje meno je kratsie ako 10 znakov");
        }

    }
}
