package DruhyPolrok.Tyden11.PornoFilm;

import java.util.ArrayList;
import java.util.List;

public class PornoHerecka {

    String menoPriezvisko;
    String pseudonym;
    double dostrek;
    double hlbkaVaginy;

    List<String> filmy = new ArrayList<>();

    public void hraVoFilme(String nazovFilmu){
        filmy.add(nazovFilmu);
    }

    public PornoHerecka(){
    }
    public PornoHerecka(String meno,String pseudonym1,double dostrek1,double hlbkaVaginy1){
        this.menoPriezvisko=meno;
        this.pseudonym=pseudonym1;
        this.dostrek=dostrek1;
        this.hlbkaVaginy=hlbkaVaginy1;
    }


    @Override
    public String toString() {
        return "PornoHerecka{" +
                "menoPriezvisko='" + menoPriezvisko + '\'' +
                ", pseudonym='" + pseudonym + '\'' +
                ", dostrek=" + dostrek +
                ", hlbkaVaginy=" + hlbkaVaginy +
                '}';
    }
}
