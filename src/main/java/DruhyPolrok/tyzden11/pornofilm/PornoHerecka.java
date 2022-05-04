package DruhyPolrok.tyzden11.pornofilm;

import java.util.ArrayList;
import java.util.List;

public class PornoHerecka extends Herec{

    private double dostrik;
    private double hlbkaChacharuse;


    PornoHerecka() {
        super();
    }
    public PornoHerecka(String menoPriezvisko, String pseudonym, double dostrik, double hlbkaChacharuse) {
        super(menoPriezvisko, pseudonym);
        this.dostrik = dostrik;
        this.hlbkaChacharuse = hlbkaChacharuse;
    }

    public void hraVoFilme(String nazovFilmu){
        filmy.add(nazovFilmu);
    }

    @Override
    public String toString() {
        return "PornoHerecka{" +
                "menoPriezvisko='" + super.getMenoPriezvisko() + '\'' +
                ", pseudonym='" + super.getPseudonym() + '\'' +
                ", dostrik=" + dostrik +
                ", hlbkaChacharuse=" + hlbkaChacharuse +
                '}';
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

        for (PornoHerec pornoHerec : pornoHerci) {
            System.out.println(pornoHerec.getMenoPriezvisko()+" sa zucastnil na obstastneni pornoherecky menom " + getMenoPriezvisko());
            pornoHerec.setObjemVacku(pornoHerec.getObjemVacku()-6.0);
        }
        // sout bude "xyz sa zucastnil na obstastneni pornohereciky menom ... "
        // treba odcitat 6.0 z objemu vacku kazdeho pornoherca.
    }
}
