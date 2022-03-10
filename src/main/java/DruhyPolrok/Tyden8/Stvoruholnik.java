package DruhyPolrok.Tyden8;

public class Stvoruholnik {


    double a;
    double b;

    public Stvoruholnik( double vstupnyAtribut, double vstupnyAtribut2){
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
    }
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