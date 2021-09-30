package PrvyPolrok.september29;


public class opakovanie {

    public static void main(String[] args){

        String Meno;
        String Priezvisko;
        String Cele;

        int nahodne = (int) (Math.random() * 20);
        String nic ="";
        Meno = "Patrik";
        Priezvisko = "Smolicek";
        Cele = Meno + " " + Priezvisko;
        boolean jeVacsi = Cele.length()>nahodne;
        System.out.println("Dlzka mojho mena je "+Cele.length());
        String vysledok;
        if (jeVacsi){
            vysledok = "Ano";
        }
        else{
            vysledok= "Nie";

        }
        System.out.println(nahodne +" Je moje meno dlhšie ako nahodné číslo? "+vysledok);
        System.out.println(Cele.toLowerCase());
        System.out.println(Cele.toUpperCase());
        System.out.println(Cele.isEmpty());
        System.out.println(nic.isEmpty());



    }
}
