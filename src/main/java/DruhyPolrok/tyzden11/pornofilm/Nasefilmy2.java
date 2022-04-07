package DruhyPolrok.tyzden11.pornofilm;

import java.util.List;

import static DruhyPolrok.tyzden11.pornofilm.Commons.pornoHerci;
import static DruhyPolrok.tyzden11.pornofilm.Commons.pornoHerecky;

public class Nasefilmy2 {

    public static void main(String[] args) {

        PornoHerecka pornoHerecka = pornoHerecky().get(0);


        getObjemVacku();

        pornoHerecka.robiGangbang(pornoHerci());

        getObjemVacku();

    }

    private static void getObjemVacku(){
        pornoHerci().forEach( ph -> System.out.println(ph.getObjemVacku()));

    }
}
