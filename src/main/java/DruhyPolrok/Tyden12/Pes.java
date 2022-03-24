package DruhyPolrok.Tyden12;

public class Pes {

   private String rasa;
    private String pohlavie;
    private double vek;
    private String meno;

    public Pes(){}

    public Pes (String rasa1, String pohlavie1, double vek1, String meno1){
        this.rasa=rasa1;
        this.pohlavie=pohlavie1;
        this.vek=vek1;
        this.meno=meno1;
    }
    public void hrasa(){
        System.out.println(meno + " sa hra!");
    }
    public String getRasa(){
        return this.rasa;
    }

    public void setVek(double vek) {
        this.vek = vek;
    }

    public void hrasasfenou(Pes pes) {
        if(pes.pohlavie=="fena"){
            System.out.println(meno+" sa hra s "+ pes.meno);
        }
        else{
            System.out.println(meno+" pokusal "+pes.meno);
        }
    }

    @Override
    public String toString() {
        return "Pes{" +
                "rasa='" + rasa + '\'' +
                ", pohlavie='" + pohlavie + '\'' +
                ", vek=" + vek +
                ", meno='" + meno + '\'' +
                '}';
    }
}
