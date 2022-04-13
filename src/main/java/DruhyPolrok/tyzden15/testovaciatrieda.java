package DruhyPolrok.tyzden15;

public class testovaciatrieda {
    private int x;
    private long l;
    private String meno;

    public testovaciatrieda(){}

    public testovaciatrieda(int x, long l, String meno) {
        this.x = x;
        this.l = l;
        this.meno = meno;
    }
    public void setInt(int z){
        x=z;
    }

    public int getX() {
        return x;
    }
    public long getL(){
        return l;
    }
    public String getMeno(){
        return meno;
    }

    @Override
    public String toString() {
        return "testovaciatrieda{" +
                "x=" + x +
                ", l=" + l +
                ", meno='" + meno + '\'' +
                '}';
    }
}
