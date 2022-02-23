package DruhyPolrok.Tyden8;

public class Stvoruholnik {


    double a;
    double b;

    public double obvod(){
        return 2*(a+b);
    }
    public double obsah(){
        return a*b;
    }

    @Override
    public String toString() {
        return "Stvoruholnik{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
