package main;

public class TorpedoTeszt {

    public static void main(String[] args) {
        tesztLoves(4);
    }

    public static String tesztLoves(int poz) {
        Hajo hajo = new Hajo();
        String t = hajo.talalat(poz);
        assert t.equals("talált") : "nem jó a találat ellenőrzése";
        return "";
    }

}
