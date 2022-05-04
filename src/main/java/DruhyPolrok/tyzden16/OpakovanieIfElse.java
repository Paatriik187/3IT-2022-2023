package DruhyPolrok.tyzden16;

public class OpakovanieIfElse {
    public static void main(String[] args) {
        naseIfElse(10);
    }

    static void naseIfElse(int hodina){
        if(hodina<12){
            System.out.println("dopoludnia");
        }
        else if (hodina<18){
            System.out.println("popoludni");
        }
        else{
            System.out.println("noc");
        }
    }


}
