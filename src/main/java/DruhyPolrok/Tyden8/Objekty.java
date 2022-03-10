package DruhyPolrok.Tyden8;

import PrvyPolrok.Tyden49.test;

public class Objekty {


    public static void main(String[] args) {
        Stvoruholnik z = new Stvoruholnik(5,-1);
        System.out.println(z);
        Trojuholnik l = new Trojuholnik(2,2,3,2);
        System.out.println(l);
        Kruh a = new Kruh(2.4);
        System.out.println(a);
        KontrolaPrimitivnychDatovychTypovAString test = new KontrolaPrimitivnychDatovychTypovAString();
        System.out.println(test);
        Kruh dva = new Kruh(-2);
        System.out.println(dva);
        Stvoruholnik stvorec = new Stvoruholnik(2,2);
        System.out.println(l.toString());
        System.out.println("Obsah trojuholníka je "+l.obsah2());
        System.out.println("Obvod trojuholníka je "+l.obvod());
        System.out.println("Obsah kruhu je "+a.obsah());
        System.out.println("Obvod kruhu je "+a.obvod() );
        System.out.println("Obsah stvoruholnika je "+stvorec.obvod() );
        System.out.println("Obvod stvoruholnika je "+stvorec.obsah() );
    }
}
