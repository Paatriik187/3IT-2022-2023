package DruhyPolrok.tyzden16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        Zena Jozef = new Zena(6, "Jozefina", 150);
        Zena Klementina = new Zena(19, "Ctiborina", 160);
        Zena Stanislava = new Zena(14, "Stanka", 160);
        Zena Konzuela = new Zena(16, "Konzuela", 150);
        Zena Gizela = new Zena(46, "Gizela", 160);
        Muz Tichomir = new Muz(76, "Tichomir", 150);
        Muz Bonaventura = new Muz(18, "Bonaventura", 160);
        Muz Servac = new Muz(55, "Servac", 150);
        Muz Einar = new Muz(48, "Einar", 160);
        Muz Stano = new Muz(17, "Standa", 150);
        List<Muz> muzi = new ArrayList<>();
        muzi.add(Tichomir);
        muzi.add(Bonaventura);
        muzi.add(Servac);
        muzi.add(Einar);
        muzi.add(Stano);

        List<Zena> zeny = new ArrayList<>();
        zeny.add(Jozef);
        zeny.add(Klementina);
        zeny.add(Stanislava);
        zeny.add(Konzuela);
        zeny.add(Gizela);

        for (Muz muz : muzi) {
            if(muz.getVek()>18){
                //System.out.println("Muzi nad 18 "+muz.getMeno());
            }
            if(muz.getMeno().length()>7){
                //System.out.println("Mena dlhsie ako 7 "+muz.getMeno());
            }
        }
        for (Zena zena : zeny) {
            if(zena.getVek()>15){
                //System.out.println("Zeny nad 15 "+zena.getMeno());
            }
            if(zena.getMeno().length()>7){
                //System.out.println("Mena dlhsie ako 7 "+zena.getMeno());
            }
        }
        List<Entity> celyzoznam = new ArrayList<>();
        celyzoznam.addAll(zeny);
        celyzoznam.addAll(muzi);
        int vysledok = 0;
        int priemer=0;
        for (Entity entity : celyzoznam) {
            vysledok = entity.getVyska() + vysledok;
        }
        priemer=vysledok/celyzoznam.size();
        System.out.println(priemer);


    }
}
