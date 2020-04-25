import java.io.Serializable;
import java.util.Random;
import java.util.Scanner;

public class Ristinolla {
    private char pelaajanMerkki;
    protected char[][] pelilauta;
    public String t = "Tilanne laudalla:";

    /**
     * Luo uuden pelilaudan joka on 3x3 matriisi
     * asettaa pelaajan merkiksi x
     */
    public Ristinolla() {
        pelilauta = new char[3][3];
        tyhjennaPelilauta();
        pelaajanMerkki = 'x';
    }

    /**
     * asettaa laudan kaiksi arvoiksi tyhjän (-)
     */
    public void tyhjennaPelilauta() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                pelilauta[i][j] = '-';
            }
        }
    }

    /**
     * Luodaan "fyysinen" lauta käyttäen erikoismerkkejä apuna ja tulostetaan se
     */
    public void tulostaPelilauta() {
        String v = "-------------";
        System.out.println(v);
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(pelilauta[i][j] + " | ");
            }
            System.out.println();
            System.out.println(v);
        }
    }

    /**
     * tarkastaa voidaanko laudalle laittaa enää nappuloita
     *
     * @return true, jos laudalla ei ole enää yhtään vapaata ruutua
     */
    public boolean onkoTaysi() {
        boolean onTaysi = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (pelilauta[i][j] == '-') {
                    onTaysi = false;
                    break;
                }
            }
        }
        return onTaysi;
    }

    /**
     * @return true, jos jokin kolmesta rivistä on voittava rivi
     */
    public boolean tarkistaVoittikoRivi() {
        for (int i = 0; i < 3; i++) {
            if (tarkista(pelilauta[i][0], pelilauta[i][1], pelilauta[i][2])) {
                return true;
            }
        }
        return false;
    }

    public boolean tarkistaVoittikoRiviX() {
        for (int i = 0; i < 3; i++) {
            if (tarkistaX(pelilauta[i][0], pelilauta[i][1], pelilauta[i][2])) {
                return true;
            }
        }
        return false;
    }

    public boolean tarkistaVoittikoRiviO() {
        for (int i = 0; i < 3; i++) {
            if (tarkistaO(pelilauta[i][0], pelilauta[i][1], pelilauta[i][2])) {
                return true;
            }
        }
        return false;
    }

    /**
     * @return true, jos jompi kumpi diagonaaleista on voittava
     */
    public boolean tarkistaVoittikoDiagonaali() {
        return ((tarkista(pelilauta[0][0], pelilauta[1][1], pelilauta[2][2])) || (tarkista(pelilauta[2][0], pelilauta[1][1], pelilauta[0][2])));
    }

    public boolean tarkistaVoittikoDiagonaaliX() {
        return ((tarkistaX(pelilauta[0][0], pelilauta[1][1], pelilauta[2][2])) || (tarkista(pelilauta[2][0], pelilauta[1][1], pelilauta[0][2])));
    }

    public boolean tarkistaVoittikoDiagonaaliO() {
        return ((tarkistaO(pelilauta[0][0], pelilauta[1][1], pelilauta[2][2])) || (tarkista(pelilauta[2][0], pelilauta[1][1], pelilauta[0][2])));
    }

    /**
     * @return true, jos joku kolmesta sarakkeesta on voittava sarake
     */
    public boolean tarkistaVoittikoSarake() {
        for (int i = 0; i < 3; i++) {
            if (tarkista(pelilauta[0][i], pelilauta[1][i], pelilauta[2][i])) {
                return true;
            }
        }
        return false;
    }

    public boolean tarkistaVoittikoSarakeX() {
        for (int i = 0; i < 3; i++) {
            if (tarkistaX(pelilauta[0][i], pelilauta[1][i], pelilauta[2][i])) {
                return true;
            }
        }
        return false;
    }

    public boolean tarkistaVoittikoSarakeO() {
        for (int i = 0; i < 3; i++) {
            if (tarkistaO(pelilauta[0][i], pelilauta[1][i], pelilauta[2][i])) {
                return true;
            }
        }
        return false;
    }

    /**
     * @return true, jos arvo kyseisessä ruudussa on sama kuin muissakin ja se ei ole "-"
     */
    public boolean tarkistaX(char x1, char x2, char x3) {
        if ((x1 == 'x') && (x1 == x2) && (x2 == x3)) {
            return true;
        } else {
            return false;
        }

    }

    public boolean tarkista(char x1, char x2, char x3) {
        if ((x1 != '-') && (x1 == x2) && (x2 == x3)) {
            return true;
        } else {
            return false;
        }

    }

    public boolean tarkistaO(char x1, char x2, char x3) {
        if ((x1 == 'o') && (x1 == x2) && (x2 == x3)) {
            return true;
        } else {
            return false;
        }

    }

    /**
     * @return true, jos laudalta löytyy 3 vierekkäistä samaa symbolia
     */
    public boolean voittiko() {
        return tarkistaVoittikoDiagonaali() || tarkistaVoittikoRivi() || tarkistaVoittikoSarake();
    }

    public boolean voittikoX() {
        return tarkistaVoittikoDiagonaaliX() || tarkistaVoittikoRiviX() || tarkistaVoittikoSarakeX();
    }

    public boolean voittikoO() {
        return tarkistaVoittikoDiagonaaliO() || tarkistaVoittikoRiviO() || tarkistaVoittikoSarakeO();
    }

    /**
     * tällä metodilla pelaaja voi asettaa nappulan pelilaudalle
     *
     * @param rivi   ,rivi jolle nappula halutaan sijoittaa
     * @param sarake , sarake jolle nappula halutaan sijoittaa
     */
    public boolean laitaNappula(int rivi, int sarake) {
        if ((rivi >= 0) && (rivi < 3)) {
            if ((sarake >= 0) && (sarake < 3)) {
                if (pelilauta[rivi][sarake] == '-') {
                    pelilauta[rivi][sarake] = annaPelaajanMerkki();
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * metodi jolla tietokone voi asettaa nappulansa
     *
     * @param rivi   , rivi jolle tietokone asettaa nappulansa
     * @param sarake , sarake jolle tietokone asettaa nappulansa
     */
    public void laitaKoneenNappula(int rivi, int sarake) {
        Random r = new Random();

        while (pelilauta[rivi][sarake] == 'x' || pelilauta[rivi][sarake] == 'o') {
            rivi = r.nextInt(3);
            sarake = r.nextInt(3);
            if (onkoTaysi()) {
                break;
            }
        }
        if (pelilauta[rivi][sarake] == '-') {
            pelilauta[rivi][sarake] = 'o';
        }
    }

    /**
     * metodilla voi kysyä pelaajan merkin
     */
    public char annaPelaajanMerkki() {
        return pelaajanMerkki;
    }

    /**
     * metodilla vaihdetaan pelaajien merkki, eli vuoro vaihtuu kaksinpelissä
     */
    public void seuraavaPelaaja() {
        if (pelaajanMerkki == 'x') {
            pelaajanMerkki = 'o';
        } else {
            pelaajanMerkki = 'x';
        }
    }
}