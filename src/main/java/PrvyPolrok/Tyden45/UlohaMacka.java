package PrvyPolrok.Tyden45;

public class UlohaMacka {

    public static void main(String[] args) {
        isCatPlaying(true,36);
    }
    static boolean isCatPlaying(boolean Summer,int teplota){
        if(Summer){
            if(teplota>25){
                if(teplota<45){
                    return true;
                }
                else{
                    return false;
                }
            }
            else{
                return false;}
        }
        else{
            if(teplota>25){
                if (teplota<35){
                    return true;
                }
                else{
                    return false;
                }
            }
            else{
                return false;
            }
        }

    }
}
