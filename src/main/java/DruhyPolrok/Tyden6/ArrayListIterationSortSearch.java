package DruhyPolrok.Tyden6;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListIterationSortSearch {
    public static void main(String[] args) {
        ArrayList<String> pole = new ArrayList<>();
        pole.add("Janko");
        pole.add("Standa");
        pole.add("Lexa");
        pole.add("Bonaventura");
        pole.add("Igor");
        int test = Collections.binarySearch(pole,"Igor");
        //System.out.println(pole.get(test));
        Collections.sort(pole);
        Collections.binarySearch(pole,"Igor");
        test = Collections.binarySearch(pole,"Igor");
        System.out.println(pole.get(test));
        //for (int i = 0;i<pole.size();i++){
          //  System.out.println("iteracia "+i);
            //pole.remove(3);
            //System.out.println("Po zmazani elementu "+pole);
        //}
        int y=0;
        for(String s : pole){
            System.out.println(s+" tu si pridam k elementu niceo");
            System.out.println("iteracia "+ y++);
            pole.remove(3);
            System.out.println("Po zmazani elementu "+ pole);
        }
    }
}
