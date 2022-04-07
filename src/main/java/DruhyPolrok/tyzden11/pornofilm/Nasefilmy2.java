package DruhyPolrok.tyzden11.pornofilm;

import java.util.List;

import static DruhyPolrok.tyzden11.pornofilm.Commons.pornoHerci;
import static DruhyPolrok.tyzden11.pornofilm.Commons.pornoHerecky;

public class Nasefilmy2 {

    public static void main(String[] args) {

        PornoHerecka pornoHerecka = pornoHerecky().get(0);
        List<PornoHerec> herci = pornoHerci();
        //herci.forEach(ph -> System.out.println(ph.getObjemVacku()));
        for (PornoHerec herec : herci) {
            System.out.println(herec.getObjemVacku());
        }

        pornoHerecka.robiGangbang(pornoHerci());

        //herci.forEach( ph -> System.out.println(ph.getObjemVacku()));
        for (PornoHerec herec : herci) {
            System.out.println(herec.getObjemVacku());
        }
    }

    private static void getObjemVacku(){
        //pornoHerci().forEach( ph -> System.out.println(ph.getObjemVacku()));

    }
}
