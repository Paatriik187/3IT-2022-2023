package DruhyPolrok.tyzden11.pornofilm;

import java.util.ArrayList;
import java.util.List;

public class Herec {

    private String menoPriezvisko;
    private String pseudonym;
    List<String> filmy = new ArrayList<>();

    public Herec(){}

    public Herec(String menoPriezvisko, String pseudonym) {
        this.menoPriezvisko = menoPriezvisko;
        this.pseudonym = pseudonym;
    }

    public String getMenoPriezvisko() {
        return menoPriezvisko;
    }

    public void setMenoPriezvisko(String menoPriezvisko) {
        this.menoPriezvisko = menoPriezvisko;
    }

    public String getPseudonym() {
        return pseudonym;
    }

    public void setPseudonym(String pseudonym) {
        this.pseudonym = pseudonym;
    }

    public List<String> getFilmy() {
        return filmy;
    }

    public void setFilmy(List<String> filmy) {
        this.filmy = filmy;
    }



    public void pridatFilm(String nazovFilmu){
        filmy.add(nazovFilmu);
        System.out.println("Film herca/herecky "+getMenoPriezvisko()+" s nazvom "+nazovFilmu+" bol pridany.");
    }

    public boolean odobratFilm(String nazovFilmu){
        if(filmy.contains(nazovFilmu)){
            filmy.remove(nazovFilmu);
            System.out.println("Film herca/herecky "+getMenoPriezvisko()+" s nazvom "+nazovFilmu+" bol uspesne odobrany");
            return true;
        }
        else {
            System.out.println("Film s názvom "+nazovFilmu+" neexistuje");
            return false;
        }
    }
}
