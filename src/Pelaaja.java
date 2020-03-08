public class Pelaaja extends Ristinolla{
    protected char pelaajanMerkki;
    public Pelaaja(){
        pelaajanMerkki = 'x';
    }
    @Override
    public char annaPelaajanMerkki(){
        return pelaajanMerkki;
    }
    @Override
    public void seuraavaPelaaja(){
        if(pelaajanMerkki == 'x'){
            pelaajanMerkki = 'o';
        }else{
            pelaajanMerkki = 'x';
        }
    }
}