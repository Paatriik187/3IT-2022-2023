package DruhyPolrok.Tyden4;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListy {
    public static void main(String[] args) {
        zaklady();
    }

    public static void zaklady(){
        ArrayList<String> pole = new ArrayList<>();
        System.out.println(pole.size());
        pole.add("Tomas");
        pole.add("Patrik");
        pole.add("David");
        pole.add("Jozef");
        pole.add("Peter");
        pole.add("Tomas");
        pole.remove("Tomas");
        pole.toString();
        System.out.println(pole);

        ArrayList<Integer> pole2 = new ArrayList<>();
        pole2.add(5);
        pole2.add(9);
        pole2.add(9);
        pole2.add(4);
        pole2.add(2);
        System.out.println(pole2);


        ArrayList<Boolean> pole3 = new ArrayList<>();
        pole3.add(true);
        pole3.add(false);
        pole3.add(true);
        pole3.add(true);
        pole3.add(false);
        System.out.println(pole3);
    }
}