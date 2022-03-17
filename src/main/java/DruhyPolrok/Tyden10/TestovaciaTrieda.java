package DruhyPolrok.Tyden10;

import java.util.ArrayList;

public class TestovaciaTrieda {

    public static void main(String[] args) {
        Osoba zaklad = new Osoba();
        Osoba Tomas = new Osoba("Jozef","Pradlovsky",180);
        Osoba Patrik = new Osoba("Patrik","Martinec",120);
        Osoba TImo = new Osoba("Timo","Melis",180);

        ArrayList<Osoba> zoznamosob = new ArrayList<>();
        zoznamosob.add(zaklad);
        zoznamosob.add(Tomas);
        zoznamosob.add(Patrik);
        zoznamosob.add(TImo);

        for (Osoba osoba : zoznamosob){
            System.out.println(osoba.ucisajavu());
        }
    }
}
