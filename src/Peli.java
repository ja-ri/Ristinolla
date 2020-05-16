
import java.util.Scanner;
import java.util.Random;

public class Peli {// extends Ristinolla { //TODO: TÄMÄ EI PERI RISTINOLLAA! 
	
	Scanner scan = new Scanner(System.in);
	Ristinolla peli = new Ristinolla(); // Alustakaa tämä konstruktorissa, jotta saatte annettua tuon pelilauta-olion
										// parametriksi!
	Random rnd = new Random();
	Tallennus tal = new Tallennus();

	// TODO: Tähän kaksi muuttujaa, jotka ovat tyyppiä Pelaaja

	public Peli() { // TODO:TÄÄLTÄ TULEE KAKSI PARAMETRIA, Jotka ovat tyyppiä pelaaja
		
		// TODO: TALLENNA MUUTTUJAT YLEMPÄNÄ MÄÄRITELTYIHIN pelaaja1 ja pelaaja2 -MUUTTUJIIN
		
		pelilauta = new char[3][3]; //Tallenna tämä peli-olioon.

	}

	public void asetaPelilauta(char[][] pepi) {
		this.pelilauta = pepi; //tämä on varmaankin pelin lataus. Asettakaa pelilauta tuolle peli -oliolle.
	}

	// TODO: Tähän metodi, joka pelaa pelin
	public void pelaaPeli() {
		do {
			// pelaaja1.pelaaVuoro(pelilauta); //Pelaaja 1 pelaa vuoron. Toteutus löytyy
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

	//Tätä koodia ei tarvita täällä, mutta osa siitä tarvitaan luokissa "TietokonePelaaja" ja "Ihmispelaaja"
	
	
	
//	public void pelaaTietokone() {
//		int rivi;
//		int sarake;
//		do {
//			System.out.println(peli.t);
//			peli.tulostaPelilauta();
//			int b;
//			System.out.println("Anna tyhjä rivi ja sarake asettaaksesi nappula.");
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
//						"Pelaaja " + peli.annaPelaajanMerkki() + ", anna tyhjä rivi ja sarake asettaaksesi nappula.");
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
