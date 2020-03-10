import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Ristinolla peli = new Ristinolla();
        Random rnd = new Random();
        Tallennus tal = new Tallennus();
        peli.tyhjennaPelilauta();
        System.out.println("Ristinolla");
        System.out.println("Valitse 1 jos pelaat tietokonetta vastaan, 2 jos pelaat kaverin kanssa ja 3 jos haluat ladata kesken j‰‰neen pelin");
        System.out.println("Jos haluaat tallentaa pelin kirjoita 5");
        if (scan.nextInt() == 1) {


                int rivi;
                int sarake;
                do {
                    System.out.println(peli.t);
                    peli.tulostaPelilauta();
                    System.out.println("Anna tyhj‰ rivi ja sarake asettaaksesi nappula.");
                    if (scan.nextInt() == 5) {
                        tal.tallenna();
                        System.exit(5);
                        break;
                    } else {
                        rivi = scan.nextInt() - 1;
                        sarake = scan.nextInt() - 1;
                        peli.laitaNappula(rivi, sarake);
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



        } else if (scan.nextInt() == 2){
                do {
                    System.out.println(peli.t);
                    peli.tulostaPelilauta();
                    int rivi;
                    int sarake;
                    do {
                        System.out.println("Pelaaja " + peli.annaPelaajanMerkki() + ", anna tyhj‰ rivi ja sarake asettaaksesi nappula.");
                        rivi = scan.nextInt() - 1;
                        sarake = scan.nextInt() - 1;
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
        if (scan.nextInt() == 3) {
                tal.lataa();
        }

        }
    }

