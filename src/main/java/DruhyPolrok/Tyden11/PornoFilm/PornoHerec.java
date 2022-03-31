package DruhyPolrok.Tyden11.PornoFilm;

import java.util.ArrayList;
import java.util.List;

public class PornoHerec {

    private String MenoPriezvisko;
    private String Pseudonym;
    private double objemSemeniku;
    private double dlzka;
    private double dostrek;
    private double objemStreku = 6.0;
    List<String> filmy = new ArrayList<>();

    public void hraVoFilme(String nazovFilmu){
        filmy.add(nazovFilmu);
        objemSemeniku=objemSemeniku-objemStreku;
    }

    public void setObjemSemeniku(double objem){
        if(objem < 0){
            objemSemeniku = 0;
        }
        else{
            objemSemeniku=objem;
        }
    }

    public void setDlzka(double dlzka) {
        this.dlzka = dlzka;
    }

    public void setDostrek(double dostrek) {
        this.dostrek = dostrek;
    }

    public void setObjemStreku(double objemStreku) {
        this.objemStreku = objemStreku;
    }

    public String getMenoPriezvisko() {
        return MenoPriezvisko;
    }

    public String getPseudonym() {
        return Pseudonym;
    }

    public double getDlzka() {
        return dlzka;
    }

    public double getDostrek() {
        return dostrek;
    }

    public double getObjemStreku() {
        return objemStreku;
    }

    public double getObjemSemeniku(){
        return objemSemeniku;
    }

    public void setdlzka(double dlzkaa){
        if(dlzkaa < 0){
            dlzka = 0;
        }
        else{
            dlzka=dlzkaa;
        }
    }
    public double getdlzka(){
        return dlzka;
    }


    public PornoHerec(){}

    public PornoHerec(String Meno,String Pseudonymm,double objemSemenikuu,double dlzkaa,double dostrekk,double objemStrekuu){
        this.MenoPriezvisko=Meno;
        this.Pseudonym=Pseudonymm;
        this.objemSemeniku=objemSemenikuu;
        this.dlzka=dlzkaa;
        this.dostrek=dostrekk;
    }

    @Override
    public String toString() {
        return "PornoHerec{" +
                "MenoPriezvisko='" + MenoPriezvisko + '\'' +
                ", Pseudonym='" + Pseudonym + '\'' +
                ", objemSemeniku=" + objemSemeniku +
                ", dlzka=" + dlzka +
                ", dostrek=" + dostrek +
                ", filmy=" + filmy +
                '}';
    }
}
//10:50
