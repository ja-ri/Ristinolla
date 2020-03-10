import java.io.*;

public class Tallennus extends Ristinolla {

    /**
     * tallentaa pelin
     */
    public void tallenna(char[][] a) {
        String b = "";
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                b = b + String.valueOf(a[i][j]);
            }
        }

        BufferedWriter writer = null;
        try{
            File tiedosto = new File("Ristinolla.txt");
            FileWriter kirjoittaja = new FileWriter(tiedosto);
            writer = new BufferedWriter(kirjoittaja);
            writer.write(b);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    /**
     * lataa aiemmin tallennetun pelin
     */
    public void lataa() {
        File tiedosto = new File("Ristinolla.txt");
        char[][] a = new char[3][3];
        String b = "";
        try {
            BufferedReader riideri = new BufferedReader(new FileReader(tiedosto));
            b = riideri.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        a[0][0] = b.charAt(0);
        a[0][1] = b.charAt(1);
        a[0][2] = b.charAt(2);
        a[1][0] = b.charAt(3);
        a[1][1] = b.charAt(4);
        a[1][2] = b.charAt(5);
        a[2][0] = b.charAt(6);
        a[2][1] = b.charAt(7);
        a[2][2] = b.charAt(8);

        Peli d = new Peli();
        d.asetaPelilauta(a);
        d.tulostaPelilauta();
    }
}