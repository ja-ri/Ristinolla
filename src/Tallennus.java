import java.io.*;

public class Tallennus extends Ristinolla{

    /**
     * tallentaa pelin
     */
    public void tallenna() {
        char[][] pelilauta = this.pelilauta;
        String tiedostonNimi = "ristinolla";
        try {
            FileOutputStream file = new FileOutputStream(tiedostonNimi);
            ObjectOutputStream out = new ObjectOutputStream(file);

            out.writeObject(pelilauta);

            out.close();
            file.close();

            System.out.println("Peli tallennettu");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * lataa aiemmin tallennetun pelin
     */
    public void lataa() {

        try {
            FileInputStream file = new FileInputStream("ristinolla");
            ObjectInputStream in = new ObjectInputStream(file);
            pelilauta = (char[][])in.readObject();

            in.close();
            file.close();

            System.out.println("Tallennettu peli ladattu");
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
    }

}