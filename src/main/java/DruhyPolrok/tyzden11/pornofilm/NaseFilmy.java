package DruhyPolrok.tyzden11.pornofilm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NaseFilmy {

    public static void main(String[] args) {

        PornoHerec jarko = new PornoHerec("Jaro Slavik", "Hulibrk"
                ,19,9,100);
        PornoHerec ferko = new PornoHerec("Fero Vrana", "Mahojakotyc"
                ,21,7,93);

        PornoHerecka evka = new PornoHerecka(" Jane Doe",
                "HmmMlask",50.6,21);
        PornoHerecka erzika = new PornoHerecka(" Jane Boo",
                "huhucoctail",2.1,19);

        List<PornoHerec> pornoherci = new ArrayList<>();
         pornoherci.add(jarko);
         pornoherci.add(ferko);
        List<PornoHerecka> pornoherecky = new ArrayList<>();
            pornoherecky.add(evka);
            pornoherecky.add(erzika);

        for (PornoHerec phc: pornoherci) {
            System.out.println( "dlzka ciciny " + phc.getMenoPriezvisko() + " je " + phc.getDlzkaCiciny());
        }

        for (PornoHerecka pornoHerecka : pornoherecky) {
            System.out.println("hlbka chacharuse " + pornoHerecka.getMenoPriezvisko()
                    + " je " + pornoHerecka.getHlbkaChacharuse());
        }

        System.out.println("=====================================");
        PornoHerecka ph = new PornoHerecka();
        System.out.println(ph.toString());
        System.out.println( "dlzka ciciny " + jarko.getMenoPriezvisko() + " je " + jarko.getDlzkaCiciny());
        evka.pridatFilm("Gangbang");
        evka.pridatFilm("v kostole");
        System.out.println(evka.getFilmy());
        System.out.println(evka.odobratFilm("Ctibor Linguini"));
        System.out.println(evka.getFilmy());
        System.out.println(evka.odobratFilm("Gangbang"));
        System.out.println(evka.getFilmy());

    }
}
