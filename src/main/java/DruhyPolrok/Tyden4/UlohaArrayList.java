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
        System.out.println(vlozenie(testovaciepole,0,"Element"));
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
        int x =pole.size();
    return "Velkost pola je "+x;
    }
    public static String vlozenie(ArrayList<String> pole, int index,String element) {
        if(index<pole.size()){
            return "Vlozeny " +element+ " na index "+index;
        }
        else{
            return "chybny index mimo rozsahu pola";
        }
    }
}
