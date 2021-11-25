package PrvyPolrok.Tyden47;

public class navratoveTypy {

    public static void main(String[] args) {
        String patrik1 = vratistring("Patrik");
        vratistring("Lubos");
        vratistring("Tomas");
        //////////////////////////
        vratinic("Patrik");
        vratinic("Lubos");
        vratinic("Tomas");
        System.out.println(patrik1);
        System.out.println(vratistring("Lubos"));
        System.out.println("----------");
        System.out.println(vratiint("Patrik"));
    }

    static void vratinic(String x){

    }

    static String vratistring(String x){
        String uprava = x+"01";
        return uprava;
    }

    static int vratiint(String x){
        int z =x.length();
        System.out.println("x");
        return z;
    }
}
