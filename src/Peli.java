
import java.util.Scanner;
import java.util.Random;

public class Peli {// extends Ristinolla { //TODO: T�M� EI PERI RISTINOLLAA! 
	
	Scanner scan = new Scanner(System.in);
	Ristinolla peli = new Ristinolla(); // Alustakaa t�m� konstruktorissa, jotta saatte annettua tuon pelilauta-olion
										// parametriksi!
	Random rnd = new Random();
	Tallennus tal = new Tallennus();

	// TODO: T�h�n kaksi muuttujaa, jotka ovat tyyppi� Pelaaja

	public Peli() { // TODO:T��LT� TULEE KAKSI PARAMETRIA, Jotka ovat tyyppi� pelaaja
		
		// TODO: TALLENNA MUUTTUJAT YLEMP�N� M��RITELTYIHIN pelaaja1 ja pelaaja2 -MUUTTUJIIN
		
		pelilauta = new char[3][3]; //Tallenna t�m� peli-olioon.

	}

	public void asetaPelilauta(char[][] pepi) {
		this.pelilauta = pepi; //t�m� on varmaankin pelin lataus. Asettakaa pelilauta tuolle peli -oliolle.
	}

	// TODO: T�h�n metodi, joka pelaa pelin
	public void pelaaPeli() {
		do {
			// pelaaja1.pelaaVuoro(pelilauta); //Pelaaja 1 pelaa vuoron. Toteutus l�ytyy
			// varsinaisesta luokasta.
			// pelaaja2.pelaaVuoro(pelilauta); //Pelaaja 2 pelaa vuoron

		} while ((!peli.voittikoO() && !peli.voittikoX()) && !peli.onkoTaysi());
		if (peli.onkoTaysi() && (!peli.voittikoO() && !peli.voittikoX())) {
			System.out.println("Tasapeli!");
			peli.tulostaPelilauta();
		}
		if ((peli.onkoTaysi() || !peli.onkoTaysi()) && peli.voittikoX()) {
			System.out.println(peli.t);
			peli.tulostaPelilauta();
			System.out.println("Pelaaja1 voitti!");

		}
		if ((peli.onkoTaysi() || !peli.onkoTaysi()) && peli.voittikoO()) {
			System.out.println(peli.t);
			peli.tulostaPelilauta();
			System.out.println("Pelaaja2 voitti!");
		}

	}

	//T�t� koodia ei tarvita t��ll�, mutta osa siit� tarvitaan luokissa "TietokonePelaaja" ja "Ihmispelaaja"
	
	
	
//	public void pelaaTietokone() {
//		int rivi;
//		int sarake;
//		do {
//			System.out.println(peli.t);
//			peli.tulostaPelilauta();
//			int b;
//			System.out.println("Anna tyhj� rivi ja sarake asettaaksesi nappula.");
//			b = scan.nextInt();
//			if (b == 5) {
//				tal.tallenna(peli.pelilauta);
//				pelaaTietokone();
//				break;
//			} else {
//				rivi = b - 1;
//				sarake = scan.nextInt() - 1;
//				if (peli.pelilauta[rivi][sarake] != '-') {
//					System.out.println("Virheellinen siirto, anna uusi ruutu");
//					rivi = scan.nextInt() - 1;
//					sarake = scan.nextInt() - 1;
//				}
//				peli.laitaNappula(rivi, sarake);
//			}
//			while (peli.laitaNappula(rivi, sarake))
//				;
//			peli.laitaKoneenNappula(rnd.nextInt(3), rnd.nextInt(3));
//
//		} while ((!peli.voittikoO() && !peli.voittikoX()) && !peli.onkoTaysi());
//		if (peli.onkoTaysi() && (!peli.voittikoO() && !peli.voittikoX())) {
//			System.out.println("Tasapeli!");
//			peli.tulostaPelilauta();
//		}
//		if ((peli.onkoTaysi() || !peli.onkoTaysi()) && peli.voittikoX()) {
//			System.out.println(peli.t);
//			peli.tulostaPelilauta();
//			System.out.println("Pelaaja voitti!");
//
//		}
//		if ((peli.onkoTaysi() || !peli.onkoTaysi()) && peli.voittikoO()) {
//			System.out.println(peli.t);
//			peli.tulostaPelilauta();
//			System.out.println("Tietokone voitti!");
//		}
//
//	}

//	public void pelaaIhminen() {
//		do {
//			System.out.println(peli.t);
//			peli.tulostaPelilauta();
//			int rivi;
//			int sarake;
//			do {
//				System.out.println(
//						"Pelaaja " + peli.annaPelaajanMerkki() + ", anna tyhj� rivi ja sarake asettaaksesi nappula.");
//				int b = 0;
//				b = scan.nextInt();
//				if (b == 5) {
//					tal.tallenna(peli.pelilauta);
//					pelaaIhminen();
//					break;
//				} else {
//					rivi = b - 1;
//					sarake = scan.nextInt() - 1;
//					if (peli.pelilauta[rivi][sarake] != '-') {
//						System.out.println("Virheellinen siirto, anna uusi ruutu");
//						rivi = scan.nextInt() - 1;
//						sarake = scan.nextInt() - 1;
//					}
//					peli.laitaNappula(rivi, sarake);
//				}
//			} while (!peli.laitaNappula(rivi, sarake));
//			peli.seuraavaPelaaja();
//		} while (!peli.voittiko() && !peli.onkoTaysi());
//		if (peli.onkoTaysi() && !peli.voittiko()) {
//			System.out.println("Tasapeli!");
//			peli.tulostaPelilauta();
//		} else {
//			System.out.println(peli.t);
//			peli.tulostaPelilauta();
//			peli.seuraavaPelaaja();
//			System.out.println(Character.toUpperCase(peli.annaPelaajanMerkki()) + " Voitti!");
//		}
//	}

}
