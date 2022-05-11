package DruhyPolrok.tyzden16;

import java.util.ArrayList;
import java.util.List;

public class Zena extends Entity{

    private final String pohlavie="Žena";

    public Zena(int vek, String meno, int vyska){
        super(meno,vek,vyska);
    }
    public String getPohlavie() {
        return pohlavie;
    }
}
