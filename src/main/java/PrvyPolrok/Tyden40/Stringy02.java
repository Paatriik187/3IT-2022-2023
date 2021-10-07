package PrvyPolrok.Tyden40;

public class Stringy02 {

    public static void main(String[] args){

        String Meno = "Patrik";
        String Priezvisko = "Smolicek";
        String Cele = Meno + " " + Priezvisko;
        Cele.indexOf(" ");
        String novy = Cele.substring(Cele.indexOf("S"));

        char charakter = Cele.charAt(4);
        System.out.println(charakter);
        System.out.println(charakter + 1);
        System.out.println("--------------------------------------------");
        System.out.print(novy.charAt(0));
        System.out.print(novy.charAt(1));
        System.out.print(novy.charAt(2));
        System.out.print(novy.charAt(3));
        System.out.print(novy.charAt(4));
        System.out.print(novy.charAt(5));
        System.out.print(novy.charAt(6));
        System.out.print(novy.charAt(7));

    }
}
