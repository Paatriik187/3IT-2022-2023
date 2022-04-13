package DruhyPolrok.tyzden15;

import java.util.ArrayList;

public class Opakovanie {
    public static void main(String[] args) {
        testovaciatrieda neco = new testovaciatrieda();
        testovaciatrieda test = new testovaciatrieda(8,4,"lol");
        System.out.println(test.getMeno());
        System.out.println(test.getX());
        System.out.println(test.getL());
        ArrayList<testovaciatrieda> mojePole = new ArrayList();
        mojePole.add(test);
        mojePole.add(neco);
        mojePole.size();
        for (testovaciatrieda testovaciatrgrrgrieda : mojePole) {
            System.out.println(testovaciatrgrrgrieda.getMeno());
        }
    }
}
