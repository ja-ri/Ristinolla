public class Ristinolla {
    private char pelaajanMerkki;
    private char[][] pelilauta;
    private String v = "-------------";
    public String t = "Tilanne laudalla:";
    public Ristinolla(){
        pelilauta = new char[3][3];
        tyhjennaPelilauta();
        pelaajanMerkki = 'x';
    }
    public void tyhjennaPelilauta(){
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                pelilauta[i][j] = '-';
            }
        }
    }
    public void tulostaPelilauta(){
        System.out.println(v);
        for (int i = 0; i < 3; i++){
            System.out.print("| ");
            for ( int j = 0; j < 3; j++){
                System.out.print(pelilauta[i][j] + " | ");
            }
            System.out.println();
            System.out.println(v);
        }
    }
    public boolean onkoTaysi(){
        boolean onTaysi = true;
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                if (pelilauta[i][j] == '-'){
                    onTaysi = false;
                }
            }
        }
        return onTaysi;
    }
    public boolean tarkistaVoittikoRivi(){
        for(int i = 0; i < 3; i++){
            if( tarkista(pelilauta[i][0], pelilauta[i][1], pelilauta[i][2]) == true){
                return true;
            }
        }
        return false;
    }
    public boolean tarkistaVoittikoDiagonaali(){
        return ((tarkista(pelilauta[0][0], pelilauta[1][1], pelilauta[2][2]) == true) || (tarkista(pelilauta[2][0], pelilauta[1][1], pelilauta[0][2]) == true));
    }
    public boolean tarkistaVoittikoSarake(){
        for(int i = 0; i < 3; i++){
            if( tarkista(pelilauta[0][i], pelilauta[1][i], pelilauta[2][i]) == true){
                return true;
            }
        }
        return false;
    }
    public boolean tarkista(char x1, char x2, char x3){
        if((x1 != '-') && (x1 == x2) && (x2 == x3)){
            return true;
        }else{
            return false;
        }

    }
    public boolean voittiko(){
        if(tarkistaVoittikoDiagonaali() == true || tarkistaVoittikoRivi() == true || tarkistaVoittikoSarake() ==true){
            return true;
        }else{
            return false;
        }
    }
    public boolean laitaNappula(int rivi, int sarake){
        if ((rivi >= 0) && (rivi < 3)){
            if((sarake >= 0) && (sarake < 3)){
                if(pelilauta[rivi][sarake] == '-'){
                    pelilauta[rivi][sarake] = pelaajanMerkki;
                    return true;
                }
            }
        }
        return false;
    }
    public char annaPelaajanMerkki(){
        return pelaajanMerkki;
    }
    public void seuraavaPelaaja(){
        if(pelaajanMerkki == 'x'){
            pelaajanMerkki = 'o';
        }else{
            pelaajanMerkki = 'x';
        }
    }
}
