package FileReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public abstract class AbstractFileReader implements FileReaderInterface {
    protected String content;

    // LECTURE DU FICHIER
    @Override
    public void readFile(String filePath) {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }
            content = sb.toString();
        } catch (IOException e) {
            System.err.println("erreur lors de la lecture du fichier : " + e.getMessage());
        }
    }

    // AFFICHER CONTENU
    @Override
    public void displayContent() {
        System.out.println(content);
    }

    // COMPARAISON FICHIERS
    public boolean compareFiles(AbstractFileReader other) {
        return this.content.equals(other.content);
    }


    public abstract void displayContentReversed();
    public abstract void displayContentPalindromic();
}
