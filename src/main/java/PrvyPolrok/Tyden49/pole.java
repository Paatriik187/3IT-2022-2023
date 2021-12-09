package PrvyPolrok.Tyden49;

public class pole {

    public static void main(String[] args) {
        System.out.println(polia(new int[]{1, 46, 4, 34, 5, 76, 44, 34, 5, 6, 6, 77,9,81,74,4 ,41,21,11,2,3,9,0,88,54,32,990,1258,2,4745,295}));
    }

    static int polia(int[] pole){
        int vys=0;
        for(int x=0;x<pole.length;x++){
            if (pole[x]%2==0) {
                if(Math.sqrt(pole[x])<4){
                    vys = vys + pole[x];
                }
            }
        }
        return vys;
    }
}
