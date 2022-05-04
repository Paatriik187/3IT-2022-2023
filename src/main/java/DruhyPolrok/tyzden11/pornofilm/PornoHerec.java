package DruhyPolrok.tyzden11.pornofilm;

import java.util.ArrayList;
import java.util.List;

public class PornoHerec extends Herec{

    private double dlzkaCiciny;
    private double objemVacku;
    private double dostrek;

   private final double objemJednehoStriku = 6.0;


     PornoHerec() {
        super();
    }
    public PornoHerec(String menoPriezvisko, String pseudonym, double dlzkaCiciny,
                      double objemVacku, double dostrek) {
        super(menoPriezvisko,pseudonym);
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


    public double getDostrek() {
        return dostrek;
    }

    public double getDlzkaCiciny(){return  dlzkaCiciny;}
    @Override
    public String toString() {
        return "PornoHerec{" +
                "menoPriezvisko='" + super.getMenoPriezvisko() + '\'' +
                ", pseudonym='" + super.getPseudonym() + '\'' +
                ", dlzkaCiciny=" + dlzkaCiciny +
                ", objemVacku=" + objemVacku +
                ", dostrek=" + dostrek +
                ", filmy=" + filmy +
                '}';
    }
}
