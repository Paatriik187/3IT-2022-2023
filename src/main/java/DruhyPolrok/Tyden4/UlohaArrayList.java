package DruhyPolrok.Tyden4;

import java.util.ArrayList;

public class UlohaArrayList {
    static ArrayList<String> testovaciepole = new ArrayList<>();
    public static void main(String[] args) {
        pridanie(testovaciepole,"prvy zaznam");
        System.out.println(testovaciepole);
        System.out.println(jepraznda1(testovaciepole));
        System.out.println(jepraznda2(testovaciepole));
        System.out.println(velkost(testovaciepole));
        System.out.println(vlozenie(testovaciepole,0,"Standa"));
        System.out.println(obsahujeElement(testovaciepole,"test"));
    }
    public static void pridanie(ArrayList<String> pole,String napridanie){
        pole.add(napridanie);
    }
    public static boolean jepraznda1(ArrayList<String> pole){
        return pole.isEmpty();

    }

    public static String jepraznda2(ArrayList<String> pole){
        if(pole.isEmpty()){
            return "Je prazdne";
        }
        else{
            return "ma elementy";
        }
    }
    public static String velkost(ArrayList<String> pole) {
    return "Velkost pola je "+pole.size();
    }
    public static String vlozenie(ArrayList<String> pole, int index,String element) {

        if(index<pole.size()){
            pole.set(index,element);
            return "Vlozeny element " +element+ " na index "+index;
        }
        else{
            return "chybny index mimo rozsahu pola";
        }
    }
    public static void vymazatPole(ArrayList<String> pole){
        pole.clear();

    }
    public static String obsahujeElement(ArrayList<String> pole, String element){
        // vrati text " pole obsahuje elelent : XXXXXX" a ked nie  " pole Neobsahuje elelent : XXXXXX
        pole.add(element);
        pole.remove(element);
        if(pole.contains(element)){
            return "Pole obsahuje element "+element;

        }
        else {
            return "Pole neobsahuje element "+element;
        }
    }


}