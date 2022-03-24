package DruhyPolrok.Tyden11.PornoFilm;

import java.util.ArrayList;
import java.util.List;

public class PornoHerec {

    String MenoPriezvisko;
    String Pseudonym;
    double objemSemeniku;
    double dlzka;
    double dostrek;
    double objemStreku = 6.0;
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
