package DruhyPolrok.tyzden16;

public class muz extends Entity{

    private final String pohlavie="muž";

    public muz(int vek, String meno, int vyska){
        super(meno,vek,vyska);
    }

    public String getPohlavie() {
        return pohlavie;
    }

}
