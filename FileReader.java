package FileReader;

public class FileReader {
    public static void main(String[] args) {

        // DEFINIR LES CHEMINS DES FICHIERS DIRECTEMENT
        String filePath1 = "/Users/rayan/Desktop/LP-WEB_COURS/JAVA-OOP/Projets/JavaCourse/src/main/java/FileReader/monFichier.txt"; // REMPLACE PAR LE CHEMIN REEL
        String filePath2 = "/Users/rayan/Desktop/LP-WEB_COURS/JAVA-OOP/Projets/JavaCourse/src/main/java/FileReader/monFichier2.txt"; // REMPLACE PAR LE CHEMIN REEL

        // LECTURE DU PREMIER FICHIER
        TextFileReader textFileReader1 = new TextFileReader();
        textFileReader1.readFile(filePath1);
        System.out.println("\n contenu du 1er fichier : ");
        textFileReader1.displayContent();

        // LECTURE DU DEUXIEME FICHIER
        TextFileReader textFileReader2 = new TextFileReader();
        textFileReader2.readFile(filePath2);
        System.out.println("\ncontenu du 2eme fichier:");
        textFileReader2.displayContent();

        // COMPARAISON DES FICHIERS
        if (textFileReader1.compareFiles(textFileReader2)) {
            System.out.println("\nfichiers identiques");
        } else {
            System.out.println("\n fichiers differents");
        }

        System.out.println("\n contenu inversé par lignes du fichier : ");
        textFileReader1.displayContentReversed();

        System.out.println("\npalindrome du fichier : ");
        textFileReader1.displayContentPalindromic();
    }
}
