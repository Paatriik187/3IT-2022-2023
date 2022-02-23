package DruhyPolrok.Tyden8;

public class Trojuholnik {

        double a;
        double b;
        double c;
        double v;

        public double obvod(){
            return a+b+c;
        }
        public double obsah(){
            return (a*v)/2;
        }

    @Override
    public String toString() {
        return "Trojuholnik{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", v=" + v +
                '}';
    }
}
