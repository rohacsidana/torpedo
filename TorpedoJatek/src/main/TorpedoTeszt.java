package main;

public class TorpedoTeszt {

    public static void main(String[] args) {
        tesztLoves(4);
    }

    public static String tesztLoves(int poz) {
        int[] tomb = {5,6,7};
        Hajo hajo = new Hajo(tomb);
        String t = hajo.talalat(poz);
        assert t.equals("talált") : "nem jó a találat ellenőrzése";
        return "";
    }

}
