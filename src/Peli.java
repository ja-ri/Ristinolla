
import java.util.Scanner;
import java.util.Random;

public class Peli extends Tallennus{
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
    public void pelaa(){
        peli.tyhjennaPelilauta();
        int a = 0;
        System.out.println("Ristinolla");
        System.out.println("Valitse 1 jos haluat pelata tietokonetta vastaan,");
        System.out.println("2 jos haluat pelata kaverin kanssa,");
        System.out.println("3 jos haluat ladata kesken j‰‰neen pelin");
        System.out.println("ja 5 jos haluaat tallentaa pelin");
        a = scan.nextInt();
        if (a == 1) {
                int rivi;
                int sarake;
                do {
                    System.out.println(peli.t);
                    peli.tulostaPelilauta();
                    int b = 0;
                    System.out.println("Anna tyhj‰ rivi ja sarake asettaaksesi nappula.");
                    b = scan.nextInt();
                    if (b == 5) {
                        tal.tallenna(peli.pelilauta);
                        pelaa();
                        break;
                    } else {
                        rivi = b - 1;
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



        } else if (a == 2){
                do {
                    System.out.println(peli.t);
                    peli.tulostaPelilauta();
                    int rivi;
                    int sarake;
                    do {
                            System.out.println("Pelaaja " + peli.annaPelaajanMerkki() + ", anna tyhj‰ rivi ja sarake asettaaksesi nappula.");
                            int b = 0;
                            b = scan.nextInt();
                            if(b == 5){
                                tal.tallenna(peli.pelilauta);
                                pelaa();
                                break;
                            }else {
                                rivi = b - 1;
                                sarake = scan.nextInt() - 1;
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
        if (a == 3) {
                tal.lataa();
        }
    }
}

