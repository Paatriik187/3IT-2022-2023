package PrvyPolrok.Tyden44;

public class VetvenieKoduUlohy {

    public static void main(String[] args) {
        najvacsiecislo(755744494L,4849949L,489493L);
        najvacsiecislo(754L,484994474749L,489493L);
        najvacsiecislo(222L,49L,431L);

    }
    static void najvacsiecislo(long x,long y,long z){

        if(x>y){
            if(x>z) {
                System.out.println("x je najvacsie cislo");
            }
        }
        if(y>z){
            if(y>x) {
                System.out.println("y je najvacsie cislo");
            }
        }
        if(z>y){
            if(z>x) {
                System.out.println("z je najvacsie cislo");
            }
             }
        }
    }

