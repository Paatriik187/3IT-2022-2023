package DruhyPolrok.Tyden8;

public class Trojuholnik {

        double a;
        double b;
        double c;
        double v;

    public Trojuholnik( double vstupnyAtribut, double vstupnyAtribut2,double vstupnyAtribut3,double v4){
        if (vstupnyAtribut>0) {
            a = vstupnyAtribut;
        }
        else{
            a=0;
        }
        if (vstupnyAtribut2>0) {
            b = vstupnyAtribut2;
        }
        else{
            b=0;
        }
        if (vstupnyAtribut3>0) {
            c = vstupnyAtribut3;
        }
        else{
            c=0;
        }
        if (v4>0) {
            v = v4;
        }
        else{
            v=0;
        }

    }


        public double obvod(){
            return a+b+c;
        }
        public double obsah(){
            return (a*v)/2;
        }
        public double obsah2(){
        double S = (a+b+c)/2;
        return Math.sqrt(S*(S-a)*(S-b)*(S-c));
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
