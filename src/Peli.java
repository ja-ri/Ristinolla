
import java.util.Scanner;
import java.util.Random;

public class Peli extends Ristinolla {
    Scanner scan = new Scanner(System.in);
    Ristinolla peli = new Ristinolla();
    Random rnd = new Random();
    Tallennus tal = new Tallennus();

    public Peli() {
        pelilauta = new char[3][3];
    }

    public void asetaPelilauta(char[][] pepi) {
        this.pelilauta = pepi;
    }

    public void pelaaTietokone() {
        int rivi;
        int sarake;
        do {
            System.out.println(peli.t);
            peli.tulostaPelilauta();
            int b = 0;
            System.out.println("Anna tyhjä rivi ja sarake asettaaksesi nappula.");
            b = scan.nextInt();
            if (b == 5) {
                tal.tallenna(peli.pelilauta);
                pelaaTietokone();
                break;
            } else {
                rivi = b - 1;
                sarake = scan.nextInt() - 1;
                if (peli.pelilauta[rivi][sarake] == '-') {
                    peli.laitaNappula(rivi, sarake);
                } else {
                    System.out.println("Virheellinen siirto, anna uusi ruutu");
                    rivi = scan.nextInt() - 1;
                    sarake = scan.nextInt() - 1;
                    peli.laitaNappula(rivi, sarake);
                }
            }
            while (peli.laitaNappula(rivi, sarake)) ;
            peli.laitaKoneenNappula(rnd.nextInt(3), rnd.nextInt(3));

        } while ((!peli.voittikoO() && !peli.voittikoX()) && !peli.onkoTaysi());
        if (peli.onkoTaysi() && (!peli.voittikoO() && !peli.voittikoX())) {
            System.out.println("Tasapeli!");
            peli.tulostaPelilauta();
        }
        if ((peli.onkoTaysi() || !peli.onkoTaysi()) && peli.voittikoX()) {
            System.out.println(peli.t);
            peli.tulostaPelilauta();
            System.out.println("Pelaaja voitti!");

        }
        if ((peli.onkoTaysi() || !peli.onkoTaysi()) && peli.voittikoO()) {
            System.out.println(peli.t);
            peli.tulostaPelilauta();
            System.out.println("Tietokone voitti!");
        }


    }

    public void pelaaIhminen() {
        do {
            System.out.println(peli.t);
            peli.tulostaPelilauta();
            int rivi;
            int sarake;
            do {
                System.out.println("Pelaaja " + peli.annaPelaajanMerkki() + ", anna tyhjä rivi ja sarake asettaaksesi nappula.");
                int b = 0;
                b = scan.nextInt();
                if (b == 5) {
                    tal.tallenna(peli.pelilauta);
                    pelaaIhminen();
                    break;
                } else {
                    rivi = b - 1;
                    sarake = scan.nextInt() - 1;
                    if (peli.pelilauta[rivi][sarake] == '-') {
                        peli.laitaNappula(rivi, sarake);
                    } else {
                        System.out.println("Virheellinen siirto, anna uusi ruutu");
                        rivi = scan.nextInt() - 1;
                        sarake = scan.nextInt() - 1;
                        peli.laitaNappula(rivi, sarake);
                    }
                }
            }
            while (!peli.laitaNappula(rivi, sarake));
            peli.seuraavaPelaaja();
        }
        while (!peli.voittiko() && !peli.onkoTaysi());
        if (peli.onkoTaysi() && !peli.voittiko()) {
            System.out.println("Tasapeli!");
            peli.tulostaPelilauta();
        } else {
            System.out.println(peli.t);
            peli.tulostaPelilauta();
            peli.seuraavaPelaaja();
            System.out.println(Character.toUpperCase(peli.annaPelaajanMerkki()) + " Voitti!");
        }
    }

}


