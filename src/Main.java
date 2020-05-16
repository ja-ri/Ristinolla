import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        Ristinolla peli = new Ristinolla(); //TÄMÄ POIS; TÄMÄ ON JO Peli -OLIOLLA
//        Tallennus tal = new Tallennus(); //TÄMÄ POIS, TÄMÄ ON JO Peli -OLIOLLA
        System.out.println("Ristinolla");
        System.out.println("Valitse 1 jos haluat pelata tietokonetta vastaan,");
        System.out.println("2 jos haluat pelata kaverin kanssa,");
        System.out.println("3 jos haluat että tietokone pelaa keskenään");
        System.out.println("4 jos haluat ladata kesken jääneen pelin");
        System.out.println("ja 5 jos haluaat tallentaa pelin");
//        peli.tyhjennaPelilauta();
        int a;
        a = Integer.parseInt(scan.nextLine()); //Kannattaa suosia tätä, eli lukekaa aina koko rivi, vaikka haluaisitte pelkän numeron. Tähän kannattaisi vielä tehdä silmukka try-catch rakenteella, siltä varalta että käyttäjä antaa virheellisiä syötteitä.
 
        
        /*
         * Seuraavaksi toteutatte tämän if-else rakenteen.
         * 
         *  Huomatkaa, että Peli -luokassa selostin, että Peli ottaa kaksi Pelaaja- parametria. 
         *  
         *  Sitten voitte luoda pelin juuri sellaiseksi, kuin valitsette:
         *  Pelaaja p1 = new Ihmispelaaja();
         *  Pelaaja p2 = new TietokonePelaaja();
         *  new Peli(p1,p2);
         *  tai...
         *  new Peli(p2,p1);
         *  
         *  tai..
         *  
         *  new Peli(new TietokonePelaaja(),new TietokonePelaaja());
         *  
         *  Kaikki eri ydistelmät siis kelpaavat. Pelaajat voivat olla molemmat ihmisiä tai tietokoneita, tai jotain siltä väliltä.
         *  
         *  Tämän jälkeen sitte asetetetaan pelille mahdollinen ladattu pelilauta ja kutsutaan peli.pelaa(); joka hoitaa kaiken muun
         */
        
        if (a == 1) {
        } else if (a == 2) {
        } else if (a == 3) {
        }

    }
}

