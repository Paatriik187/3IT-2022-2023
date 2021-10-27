package PrvyPolrok.Tyden42;

import javax.swing.text.View;

public class vetvenieKodu {

    public static void main(String[] args) {

        Mojemeno("Patrik Smolicek");
        lenif(true,"Patrik Smolicek");
        ifelse(false,"Patrik Smolicek");
    }
    public static void Mojemeno(String meno){

        if (meno.length()>10){
            System.out.println("Moje meno je dlhsie ako 10 znakov");
        }
        else {
            System.out.println("Moje meno je kratsie ako 10 znakov");
        }

    }
    static void lenif(boolean vieJavu, String meno){

        if (vieJavu){

            meno = meno + " vie Javu";
        }
        meno = meno + " vie matematiku";

        System.out.println(meno);
    }
    static void ifelse(boolean vieJavu, String meno){

        if (vieJavu){

            meno = meno + " vie Javu";
        }
        else {
            meno = meno + " vie matematiku";
        }
        System.out.println(meno);
    }
}
