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
