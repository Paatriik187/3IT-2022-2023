package PrvyPolrok.Tyden45;

public class UlohaMacka {

    public static void main(String[] args) {
        isCatPlaying(true,25);
    }
    static boolean isCatPlaying(boolean Summer,int teplota){
        boolean Cat;
        if(Summer){
            if(teplota>=25&teplota<45) {
                Cat = true;
            }
                else{
                    Cat = false;
                }
        }
        else{
            if(teplota>25&teplota<35){
                    Cat = true;
                }
                else{
                    Cat = false;
                }
        }
        if(Cat==true){
            System.out.println("Macka sa hra");
        }
        else{
            System.out.println("Macka sa nehra");
        }
        return Cat;
    }
}
