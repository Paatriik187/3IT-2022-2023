package DruhyPolrok.Tyden10;

import java.util.List;

public class Osoba {


    List<Osoba> nasaskupina;
    String meno;
    String priezvisko;
    double vyska;

    public Osoba(){


    }

    public Osoba(String menoo, String priezviskoo, double vyskaa){
        meno=menoo;
        priezvisko=priezviskoo;
        vyska=vyskaa;
    }

    public String ucisajavu(){
        return meno + " " + priezvisko + " sa brutalne uci javu";
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "nasaskupina=" + nasaskupina +
                ", meno='" + meno + '\'' +
                ", priezvisko='" + priezvisko + '\'' +
                ", vyska=" + vyska +
                '}';
    }
}
