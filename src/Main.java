import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        Ristinolla peli = new Ristinolla(); //T�M� POIS; T�M� ON JO Peli -OLIOLLA
//        Tallennus tal = new Tallennus(); //T�M� POIS, T�M� ON JO Peli -OLIOLLA
        System.out.println("Ristinolla");
        System.out.println("Valitse 1 jos haluat pelata tietokonetta vastaan,");
        System.out.println("2 jos haluat pelata kaverin kanssa,");
        System.out.println("3 jos haluat ett� tietokone pelaa kesken��n");
        System.out.println("4 jos haluat ladata kesken j��neen pelin");
        System.out.println("ja 5 jos haluaat tallentaa pelin");
//        peli.tyhjennaPelilauta();
        int a;
        a = Integer.parseInt(scan.nextLine()); //Kannattaa suosia t�t�, eli lukekaa aina koko rivi, vaikka haluaisitte pelk�n numeron. T�h�n kannattaisi viel� tehd� silmukka try-catch rakenteella, silt� varalta ett� k�ytt�j� antaa virheellisi� sy�tteit�.
 
        
        /*
         * Seuraavaksi toteutatte t�m�n if-else rakenteen.
         * 
         *  Huomatkaa, ett� Peli -luokassa selostin, ett� Peli ottaa kaksi Pelaaja- parametria. 
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
         *  Kaikki eri ydistelm�t siis kelpaavat. Pelaajat voivat olla molemmat ihmisi� tai tietokoneita, tai jotain silt� v�lilt�.
         *  
         *  T�m�n j�lkeen sitte asetetetaan pelille mahdollinen ladattu pelilauta ja kutsutaan peli.pelaa(); joka hoitaa kaiken muun
         */
        
        if (a == 1) {
        } else if (a == 2) {
        } else if (a == 3) {
        }

    }
}

