package PrvyPolrok.Tyden49;


public class test {
    public static void main(String[] args) {
        bubblesort(new int[]{4844,45465,4,844,54,5,24,56,6,0});
    }

    static void bubblesort(int[] pole) {
        int l = pole.length;
        int x = 0;

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l - 1; j++) {
                x++;
                if (pole[j] > pole[j + 1]) {
                    x = pole[j + 1];
                    pole[j + 1] = pole[j];
                    pole[j] = x;
                }

            }
        }
        for(int z=0;z<pole.length;z++) {
            System.out.println(pole[z]);
        }
    }
}
