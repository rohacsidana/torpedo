package main;

public class Hajo {

    private int[] pozicio = new int[3];

    public Hajo(int[] pozicio) {
        this.pozicio = pozicio;
    }

    public String talalat(int poz) {
        for (int i = 0; i < pozicio.length; i++) {
            if (poz == pozicio[i]) {
                return "talált";
            }
        }
        return "nem talált";
    }
}
