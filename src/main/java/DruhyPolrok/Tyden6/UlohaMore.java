package DruhyPolrok.Tyden6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UlohaMore {
    static List<Integer> pole = new ArrayList<>();
    public static void main(String[] args) {

        pridanieDoPola(82);
        pridanieDoPola(452);
        pridanieDoPola(2);
        pridanieDoPola(4);
        pridanieDoPola(2);
        pridanieDoPola(18);
        vypisaniePola();
        zoradeniePola();
        vypisaniePola();

    }
    private static void vypisaniePola(){
        System.out.println(pole.toString());
    }
    private static void zoradeniePola(){
        Collections.sort(pole);
    }
    private static void pridanieDoPola(int i){
        if(pole.contains(i)){
            System.out.println("Element "+i+" uz je v poli");
        }
        else{
            pole.add(i);
            System.out.println("Element "+i+" bol pridany");
        }
    }
}
