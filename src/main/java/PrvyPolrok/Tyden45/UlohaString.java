package PrvyPolrok.Tyden45;

public class UlohaString {

    public static void main(String[] args) {
        test();
    }
    static String text = "Človek mierou svojho chápania pracuje na seba "+
                            "a mierou nechápania na tých, kto chápe viac";

    static void test() {
        int total=0;
        char[] poleznakov=text.toCharArray();
        for(int x=0;x<text.length();x++){
            if (text.charAt(x) == ' ') {

                total++;
            }
        }
        System.out.println("Medzera je vo vete "+total+" krát");
    }
}
