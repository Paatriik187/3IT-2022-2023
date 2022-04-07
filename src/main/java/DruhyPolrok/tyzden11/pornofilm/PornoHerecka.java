package DruhyPolrok.tyzden11.pornofilm;

import java.util.ArrayList;
import java.util.List;

public class PornoHerecka {

   private String menoPriezvisko;
    private String pseudonym;
    private double dostrik;
    private double hlbkaChacharuse;
    private List<String> filmy = new ArrayList<>();

    public PornoHerecka() {
    }

    public PornoHerecka(String menoPriezvisko, String pseudonym,
                        double dostrik, double hlbkaChacharuse) {
        this.menoPriezvisko = menoPriezvisko;
        this.pseudonym = pseudonym;
        this.dostrik = dostrik;
        this.hlbkaChacharuse = hlbkaChacharuse;
    }

    public void hraVoFilme(String nazovFilmu){
        filmy.add(nazovFilmu);
    }

    @Override
    public String toString() {
        return "PornoHerecka{" +
                "menoPriezvisko='" + menoPriezvisko + '\'' +
                ", pseudonym='" + pseudonym + '\'' +
                ", dostrik=" + dostrik +
                ", hlbkaChacharuse=" + hlbkaChacharuse +
                '}';
    }

    public String getMenoPriezvisko() {
        return menoPriezvisko;
    }

    public String getPseudonym() {
        return pseudonym;
    }

    public double getDostrik() {
        return dostrik;
    }

    public double getHlbkaChacharuse() {
        return hlbkaChacharuse;
    }

    public List<String> getFilmy() {
        return filmy;
    }

    public void setMenoPriezvisko(String menoPriezvisko) {
        this.menoPriezvisko = menoPriezvisko;
    }

    public void setPseudonym(String pseudonym) {
        this.pseudonym = pseudonym;
    }

    public void setDostrik(double dostrik) {
        this.dostrik = dostrik;
    }

    public void setHlbkaChacharuse(double hlbkaChacharuse) {
        this.hlbkaChacharuse = hlbkaChacharuse;
    }

    public void setFilmy(List<String> filmy) {
        this.filmy = filmy;
    }

    public void robiGangbang(List<PornoHerec> pornoHerci) {

        // sout bude "xyz sa zucastnil na obstastneni pornohereciky menom ... "
        // treba odcitat 6.0 z objemu vacku kazdeho pornoherca.
    }
}
