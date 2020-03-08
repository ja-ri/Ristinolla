import java.util.Random;

public class Tietokone extends Ristinolla{

    /**
     * metodi jolla tietokone voi asettaa nappulansa
     * @param rivi , rivi jolle tietokone asettaa nappulansa
     * @param sarake , sarake jolle tietokone asettaa nappulansa
     */
    public void laitaKoneenNappula(int rivi, int sarake){
        Random r = new Random();

        while(pelilauta[rivi][sarake] == 'x' || pelilauta[rivi][sarake] == 'o'){
            rivi = r.nextInt(3);
            sarake = r.nextInt(3);
            if (onkoTaysi()){
                break;
            }
        }
        if(pelilauta[rivi][sarake] == '-'){
            pelilauta[rivi][sarake] = 'o';
        }
    }
}
