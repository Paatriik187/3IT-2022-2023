package DruhyPolrok.Tyden11.PornoFilm;

import java.util.Arrays;
import java.util.List;

public class Commons {

    public static List<PornoHerec> pornoherci(){
        PornoHerec Tomas = new PornoHerec("Steven Wolfe","Johnny Sins",19,20,4,6);
        PornoHerec David = new PornoHerec("Jaro Slavik","Hltac",21,14,5,6);
        return Arrays.asList(Tomas,David);
    }
    public static List<PornoHerecka> pornoherecky(){
        PornoHerecka Jozef = new PornoHerecka("Melissa Ann Hevner","Mia Malkova",3,15);
        PornoHerecka Lana = new PornoHerecka("Amara Maple","Lana Rhoades",6,17);
        return Arrays.asList(Jozef,Lana);
    }
}
