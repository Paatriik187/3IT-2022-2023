package DruhyPolrok.tyzden11.pornofilm;

import java.util.ArrayList;
import java.util.List;

public class PornoHerec {

    private String menoPriezvisko;
    private String pseudonym;
    private double dlzkaCiciny;
    private double objemVacku;
    private double dostrek;

    List<String> filmy = new ArrayList<>();
   private final double objemJednehoStriku = 6.0;

    private PornoHerec() {
    }
    public PornoHerec(String menoPriezvisko, String pseudonym, double dlzkaCiciny,
                      double objemVacku, double dostrek) {
        this.menoPriezvisko = menoPriezvisko;
        this.pseudonym = pseudonym;
        this.dlzkaCiciny = dlzkaCiciny;
        this.objemVacku = objemVacku;
        this.dostrek = dostrek;
    }

    public void hraVoFilme(String nazovFilmu){
        filmy.add(nazovFilmu);
        objemVacku = objemVacku - objemJednehoStriku;
    }

    public void setObjemVacku(double objem){
        if(objem < 0){
            objemVacku = 0;
        }else {
            objemVacku = objem;
        }
    }

    public double getObjemVacku(){
        return objemVacku;
    }

    public String getPseudonym() {
        return pseudonym;
    }

    public double getDostrek() {
        return dostrek;
    }

    public String getMenoPriezvisko(){ return menoPriezvisko;}
    public double getDlzkaCiciny(){return  dlzkaCiciny;}
    @Override
    public String toString() {
        return "PornoHerec{" +
                "menoPriezvisko='" + menoPriezvisko + '\'' +
                ", pseudonym='" + pseudonym + '\'' +
                ", dlzkaCiciny=" + dlzkaCiciny +
                ", objemVacku=" + objemVacku +
                ", dostrek=" + dostrek +
                ", filmy=" + filmy +
                '}';
    }
}
