package PrvyPolrok.Tyden42;

import javax.swing.text.View;

public class vetvenieKodu {

    public static void main(String[] args) {

        Mojemeno("Patrik Smolicek");
        lenif(true,"Patrik Smolicek");
        ifele(false,"Patrik Smolicek");

        dniVTyzdni(-1);
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
    static void ifele(boolean vieJavu, String meno){

        if (vieJavu){

            meno = meno + " vie Javu";
        }
        else {
            meno = meno + " vie matematiku";
        }
        System.out.println(meno);
    }
    static void dniVTyzdni(int x){
        if (x ==1){
            System.out.println("Pondelok");
        }
        else if(x==2){
            System.out.println("Utorok");
        }
        else if (x==3){
            System.out.println("streda");
        }
        else if (x==4){
            System.out.println("stvrtok");
        }
        else if (x==5){
            System.out.println("piatok");
        }
        else if (x==6){
            System.out.println("sobota");
        }
        else if (x==7){
            System.out.println("nedela");
        }
        else if (x>7){
            System.out.println("Neplatne cislo");
        }
        else if(x<1){
            System.out.println("Zaporne cislo");
        }
    }
}
