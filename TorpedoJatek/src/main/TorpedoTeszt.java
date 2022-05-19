package main;

public class TorpedoTeszt {

    public static void mainTeszt(String[] args) {
        tesztLoves(4);
    }

    public static String tesztLoves(int poz) {
        int[] tomb = {4,5,6};
        Hajo hajo = new Hajo(tomb);
        String t = hajo.talalat(poz);
        assert t.equals("talált") : "nem jó a találat ellenőrzése";
        return "";
    }

}
