import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Peli p = new Peli();
        Ristinolla peli = new Ristinolla();
        Tallennus tal = new Tallennus();
        System.out.println("Ristinolla");
        System.out.println("Valitse 1 jos haluat pelata tietokonetta vastaan,");
        System.out.println("2 jos haluat pelata kaverin kanssa,");
        System.out.println("3 jos haluat ladata kesken j‰‰neen pelin");
        System.out.println("ja 5 jos haluaat tallentaa pelin");
        peli.tyhjennaPelilauta();
        int a = 0;
        a = scan.nextInt();

        if (a==1) {
            p.pelaaTietokone();
        } else if(a==2) {
            p.pelaaIhminen();
        } else if (a==3) {
            tal.lataa();
        }

    }
}

