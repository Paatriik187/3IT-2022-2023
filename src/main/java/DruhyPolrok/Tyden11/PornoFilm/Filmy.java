package DruhyPolrok.Tyden11.PornoFilm;
import com.sun.javafx.scene.control.skin.VirtualFlow;

import java.util.ArrayList;
import java.util.List;
public class Filmy {

    public static void main(String[] args) {
        PornoHerec Tomas = new PornoHerec("Steven Wolfe","Johnny Sins",19,20,4,6);
        PornoHerec David = new PornoHerec("Jaro Slavik","Hltac",21,14,5,6);
        PornoHerecka Jozef = new PornoHerecka("Melissa Ann Hevner","Mia Malkova",3,15);
        PornoHerecka Lana = new PornoHerecka("Amara Maple","Lana Rhoades",6,17);

        List<PornoHerec> pornoherci = new ArrayList<>();
        List<PornoHerecka> pornoherecky = new ArrayList<>();
        pornoherci.add(Tomas);
        pornoherci.add(David);
        pornoherecky.add(Jozef);
        pornoherecky.add(Lana);

    for (PornoHerec pornoHerec: pornoherci){
        System.out.println("Dlzka ciciny "+pornoHerec.MenoPriezvisko+" je "+pornoHerec.dlzka);
    }
        for (PornoHerecka pornoHerecka: pornoherecky){
            System.out.println("Hlbka vaginy "+pornoHerecka.menoPriezvisko+" je "+pornoHerecka.hlbkaVaginy);
        }

    }
}
