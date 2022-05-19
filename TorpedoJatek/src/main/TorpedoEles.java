package main;

import java.util.Random;
import java.util.Scanner;

public class TorpedoEles {

    static int kezdoPont;
    static final int HAJO_HOSSZ = 3;
    static int lovesDb;
    static int talalatDb;
    static Hajo hajo;

    public static void main(String[] args) {
        // 7 hosszu palya, 3 hosszu hajo
        elhelyez();
        lovesBeker();
    }

    private static void elhelyez() {
        int[] tomb = new int[3];
        Random rnd = new Random();
        kezdoPont = rnd.nextInt(5);
        tomb[0] = kezdoPont;
        tomb[1] = kezdoPont + 1;
        tomb[2] = kezdoPont + 2;
        hajo = new Hajo(tomb);
    }

    private static void lovesBeker() {
        boolean sullyedtEl;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("lövés: ");
            int bekertLoves = sc.nextInt();
            String t = hajo.talalat(bekertLoves);
            if (t.equals("talált")) {
                System.out.println("-talált-");
                talalatDb++;
            } else {
                System.out.println("-nem talált-");
            }
            lovesDb++;
            sullyedtEl = talalatDb == HAJO_HOSSZ;
        } while (!sullyedtEl);
        System.out.println("süllyedt");
        System.out.println(lovesDb + " lépésből süllyesztetted el a hajót");
    }

}
