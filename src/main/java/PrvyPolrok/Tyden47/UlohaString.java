package PrvyPolrok.Tyden47;

public class UlohaString {


    public static void main(String[] args) {
        jePalindrom("TomasJeFrajer");
    }

    static boolean jePalindrom (String KontrolneSlovo){

        for(int x = 0;x<KontrolneSlovo.length();x++){
           // System.out.println(KontrolneSlovo.charAt(x));
        }
        String spolu="";


        for(int x =KontrolneSlovo.length()-1;x>=0;x--){
           // System.out.println(KontrolneSlovo.charAt(x));
            spolu = spolu+KontrolneSlovo.charAt(x);
            System.out.println(spolu);
        }

        return KontrolneSlovo == spolu;
    }
}


