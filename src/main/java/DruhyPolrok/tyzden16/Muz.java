package DruhyPolrok.tyzden16;

import java.util.ArrayList;
import java.util.List;

public class Muz extends Entity{

    private final String pohlavie="muž";

    public Muz(int vek, String meno, int vyska){
        super(meno,vek,vyska);
    }

    public String getPohlavie() {
        return pohlavie;
    }

}