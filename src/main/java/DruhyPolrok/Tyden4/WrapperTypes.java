package DruhyPolrok.Tyden4;

import java.util.ArrayList;
import java.util.Arrays;

import static java.util.Arrays.sort;

public class WrapperTypes {

    public static void main(String[] args) {
        int[] asd = new int[]{4,5,6};
        ArrayList<Integer> aa= new ArrayList<>();
        aa.add(5);
        aa.add(6);
        aa.add(5);
        ArrayList<Integer> aaa = new ArrayList<>(Arrays.asList(4,948,646,5));
        short[] b = new short[]{1,2,3};
        ArrayList<Short> bb= new ArrayList<>();
        bb.add((short) 6);
        bb.add((short) 4);
        bb.add((short) 2);
        ArrayList<Short>  bbb= new ArrayList<>(Arrays.asList((short)16,(short)46,(short)31));
        byte[] c =new byte[]{9,6,3};
        ArrayList<Byte> cc= new ArrayList<>();
        cc.add((byte) 5);
        cc.add((byte) 6);
        cc.add((byte) 9);
        ArrayList<Byte> ccc = new ArrayList<>(Arrays.asList((byte)456,(byte)1,(byte)5));
        long[] d =new long[] {546,46546,149849};
        ArrayList<Long> dd= new ArrayList<>();
        dd.add(575L);
        dd.add(2272L);
        dd.add(1479L);
        ArrayList<Long> ddd = new ArrayList<>(Arrays.asList(464L,9846L));
        float[] e =new float[] {4,6,7};
        ArrayList<Float> ee= new ArrayList<>();
        ee.add(465f);
        ee.add(91f);
        ee.add(258741f);
        ArrayList<Float> eee = new ArrayList<>(Arrays.asList(46f,496f,49846f));
        double[] f =new double[] {789456,46,54949};
        ArrayList<Double> ff= new ArrayList<>();
        ff.add(459499D);
        ff.add(58996D);
        ff.add(9956645D);
        ArrayList<Double> fff = new ArrayList<>(Arrays.asList(45464D,494646D,798464D));
        boolean[] g =new boolean[] {true,false,false};
        ArrayList<Boolean> gg= new ArrayList<>();
        gg.add(true);
        gg.add(false);
        gg.add(false);
        ArrayList<Boolean> ggg = new ArrayList<>(Arrays.asList(true,false,true));
        char[] h = new char[]{'a','s','d'};
        ArrayList<Character> hh= new ArrayList<>();
        hh.add('k');
        hh.add('k');
        hh.add('t');
        ArrayList<Character> hhh = new ArrayList<>(Arrays.asList('a','s','f'));
        System.out.println(Arrays.toString(h));
        //Vyuzivaju sa aby primitivne datove typy mohli byt objekty


    }
}
