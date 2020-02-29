import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Ristinolla peli = new Ristinolla();
        Pelaaja hlo = new Pelaaja();
        peli.tyhjennaPelilauta();
        System.out.println(" Ristinolla");
        do{
            System.out.println(peli.t);
            peli.tulostaPelilauta();
            int rivi;
            int sarake;
            do{
                System.out.println("Pelaaja " + peli.annaPelaajanMerkki() + ", anna tyhjä rivi ja sarake asettaaksesi nappula.");
                rivi = scan.nextInt() - 1;
                sarake = scan.nextInt() - 1;
            }
            while (!peli.laitaNappula(rivi, sarake));
            peli.seuraavaPelaaja();
        }
        while(!peli.voittiko() && !peli.onkoTaysi());
        if(peli.onkoTaysi() && !peli.voittiko()){
            System.out.println("  Tasapeli!");
            peli.tulostaPelilauta();
        }else{
            System.out.println(peli.t);
            peli.tulostaPelilauta();
            peli.seuraavaPelaaja();
            System.out.println(Character.toUpperCase(peli.annaPelaajanMerkki()) + " Voitti!");
        }
    }
}
