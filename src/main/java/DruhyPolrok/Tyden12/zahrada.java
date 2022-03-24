package DruhyPolrok.Tyden12;

public class zahrada {

    public static void main(String[] args) {
        Pes Jozef = new Pes("Yorkshire","fena",5,"Jozef");
        Pes Standa = new Pes("Nemecky ovciak","pes",4,"Standa");
        Pes Tomas = new Pes("Civava","pes",8,"Standa");

        Jozef.hrasa();
        Standa.hrasa();
        Standa.hrasasfenou(Jozef);
        Tomas.hrasasfenou(Standa);
        Jozef.hrasasfenou(Jozef);
        System.out.println(Jozef.getRasa());
        Jozef.setVek(69);
    }
}
