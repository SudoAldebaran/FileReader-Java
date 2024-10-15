package FileReader;

public class TextFileReader extends AbstractFileReader {

    // INVERSION PAR LIGNE
    @Override
    public void displayContentReversed() {
        String[] lines = content.split("\n");
        for (int i = lines.length - 1; i >= 0; i--) {
            System.out.println(lines[i]);
        }
    }

    // PALINDROME
    @Override
    public void displayContentPalindromic() {

        StringBuilder palindromicContent = new StringBuilder();
        for (char c : content.toCharArray()) {
            palindromicContent.insert(0, c);
        }
        System.out.println(palindromicContent.toString());
    }
}
