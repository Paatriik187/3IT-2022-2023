package PrvyPolrok.Tyden39.september29;

public class stringyPokracovanie {

    public static void main(String[] args){

        String Meno = "Patrik";
        String Priezvisko = "Smolicek";
        String Cele = Meno + " " + Priezvisko;
        Cele.indexOf(" ");
        System.out.println(Cele.indexOf(" ")); //Bezparametrove Stringy
        System.out.println("Substring mojho mena " + Cele.substring(0,6));
        System.out.println("Substring mojho priezviska " + Cele.substring(7,15));
        System.out.println(Cele.indexOf(Priezvisko));

    }
}
