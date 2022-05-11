package DruhyPolrok.tyzden16;

public class Entity {
   private String meno;
   private int vek;
   private int vyska;

   public Entity(){}
    public Entity(String meno, int vek,int vyska) {
        this.meno = meno;
        this.vek = vek;
        this.vyska=vyska;
    }


    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public int getVek() {
        return vek;
    }

    public void setVek(int vek) {
        this.vek = vek;
    }

    public int getVyska() {
        return vyska;
    }

    public void setVyska(int vyska) {
        this.vyska = vyska;
    }
}
