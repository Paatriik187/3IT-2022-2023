package PrvyPolrok.Tyden47;

public class dniVTyzdni {
    public static void main(String[] args) {
        System.out.println("Den v tyzdni je "+dniVTyzdni(1));
    }
    static String dniVTyzdni(int x){

        switch (x) {
            case 1:
            return "pondelok";
            case 2:
            return "utorok";
            case 3:
            return "streda";
            case 4:
            return "stvrtok";
            case 5:
            return "piatok";
            case 6:
            return "sobota";
            case 7:
            return "nedela";
            default:
            return "neplatny den";
        }

    }
}
