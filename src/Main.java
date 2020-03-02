import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Ristinolla peli = new Ristinolla();
        Tietokone kone = new Tietokone();
        Random rnd = new Random();
        //int rRivi = rnd.nextInt(3);
        //int rSarake = rnd.nextInt(3);
        peli.tyhjennaPelilauta();
        System.out.println(" Ristinolla");
        System.out.println("Valitse 1 jos pelaat tietokonetta vastaan, 2 jos pelaat kaverin kanssa");
        if (scan.nextInt() == 1) {
            do {
                System.out.println(peli.t);
                peli.tulostaPelilauta();
                int rivi;
                int sarake;
                do {
                    System.out.println("Anna tyhjä rivi ja sarake asettaaksesi nappula.");
                    rivi = scan.nextInt() - 1;
                    sarake = scan.nextInt() - 1;
                    peli.laitaNappula(rivi, sarake);
                }
                while (peli.laitaNappula(rivi, sarake));
                    peli.laitaKoneenNappula(rnd.nextInt(3), rnd.nextInt(3));
            }
            while (!peli.voittiko() && !peli.onkoTaysi());
                    if (peli.onkoTaysi() && !peli.voittiko()) {
                        System.out.println("  Tasapeli!");
                        peli.tulostaPelilauta();
                    } else {
                        System.out.println(peli.t);
                        peli.tulostaPelilauta();
                        System.out.println(Character.toUpperCase(peli.annaPelaajanMerkki()) + " Voitti!");
                    }

        } else {
            do {
                System.out.println(peli.t);
                peli.tulostaPelilauta();
                int rivi;
                int sarake;
                do {
                    System.out.println("Pelaaja " + peli.annaPelaajanMerkki() + ", anna tyhjä rivi ja sarake asettaaksesi nappula.");
                    rivi = scan.nextInt() - 1;
                    sarake = scan.nextInt() - 1;
                }
                while (!peli.laitaNappula(rivi, sarake));
                peli.seuraavaPelaaja();
            }
            while (!peli.voittiko() && !peli.onkoTaysi());
            if (peli.onkoTaysi() && !peli.voittiko()) {
                System.out.println("  Tasapeli!");
                peli.tulostaPelilauta();
            } else {
                System.out.println(peli.t);
                peli.tulostaPelilauta();
                peli.seuraavaPelaaja();
                System.out.println(Character.toUpperCase(peli.annaPelaajanMerkki()) + " Voitti!");
            }
        }
    }
}
