
public class Tietokone extends Ristinolla{

    public boolean laitaKoneenNappula(int rivi, int sarake){
        if ((rivi >= 0) && (rivi < 3)){
            if((sarake >= 0) && (sarake < 3)){
                if(pelilauta[rivi][sarake] == '-'){
                    pelilauta[rivi][sarake] = 'o';
                    return true;
                }
            }
        }
        return false;
    }
}
