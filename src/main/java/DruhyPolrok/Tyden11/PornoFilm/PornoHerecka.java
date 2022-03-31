package DruhyPolrok.Tyden11.PornoFilm;

import java.util.ArrayList;
import java.util.List;

public class PornoHerecka {

    private String menoPriezvisko;
    private String pseudonym;
    private double dostrek;
    private double hlbkaVaginy;

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

    public void setDostrek(double dostrek) {
        this.dostrek = dostrek;
    }

    public void setHlbkaVaginy(double hlbkaVaginy) {
        this.hlbkaVaginy = hlbkaVaginy;
    }

    public String getMenoPriezvisko() {
        return menoPriezvisko;
    }

    public String getPseudonym() {
        return pseudonym;
    }

    public double getDostrek() {
        return dostrek;
    }

    public double getHlbkaVaginy() {
        return hlbkaVaginy;
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
