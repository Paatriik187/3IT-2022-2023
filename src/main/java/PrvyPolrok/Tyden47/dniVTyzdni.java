package PrvyPolrok.Tyden47;

public class dniVTyzdni {
    public static void main(String[] args) {
        System.out.println("Den v tyzdni je "+dniVTyzdni(1));
        dniVTyzdnii(8);
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
    static void dniVTyzdnii(int y){
        String den="" ;
        switch (y) {
            case 1:
               den = "pondelok";
               break;
            case 2:
                den = "utorok";
                break;
            case 3:
                den = "streda";
                break;
            case 4:
                den = "stvrtok";
                break;
            case 5:
                den = "piatok";
                break;
            case 6:
                den = "sobota";
                break;
            case 7:
                den = "nedela";
                break;
            default:
                den = "neplatny den";
        }
        System.out.println(den);
    }
}
