package DruhyPolrok.tyzden16;

public class zena extends Entity{

    private final String pohlavie="Žena";

    public zena(int vek, String meno, int vyska){
        super(meno,vek,vyska);
    }
    public String getPohlavie() {
        return pohlavie;
    }
}
