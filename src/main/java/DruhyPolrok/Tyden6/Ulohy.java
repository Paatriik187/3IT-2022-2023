package DruhyPolrok.Tyden6;

import java.util.Arrays;
import java.util.List;

public class Ulohy {

    public static void main(String[] args) {
        List<Integer> pole3 = Arrays.asList(1, 6, 8, 1, 6, 2, 6, 1, 3, 7);
        List<Integer> pole4 = Arrays.asList(1, 6, 8, 1, 6, 2, 6, 1, 3, 7);
        List<Integer> pole5 = Arrays.asList(1, 6, 8, 1, 6, 2, 6, 1, 3, 7);
        List<Integer> pole6 = Arrays.asList(1, 6, 8, 1, 6, 2, 6, 1, 3, 7);
        System.out.println(test(Arrays.asList(5, 1, 6, 1, 2, 3, 4, 6, 0, 1)));
        lol(Arrays.asList(1,2,4,5,6));
    }

    public static boolean test(List<Integer> pole) {
        if(pole.size()==10) {
            int sum = 0;
            for (int i : pole) {
                sum += i;
            }
            if (sum == 30) {
                return true;
            } else {
                return false;
            }
        }
        else{
            return false;
        }
    }

    public static void lol(List<Integer> pole2){
        int vysledok = 0;
        for(int x = 0;x<pole2.size();x++){
            for(int y = x;y<pole2.size();y++){
                vysledok=x+y;
                if(vysledok==6){
                    System.out.println(x+"+"+y+"="+vysledok);
                }
            }
        }
    }
}