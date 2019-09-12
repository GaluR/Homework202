package pl.javastart.textcounter.service;

public class TextCounterService {

    public static int words(String text) {
        String[] temp = text.split(" ");
        return temp.length;
    }

    public static int characters(String text) {
        return text.length();
    }

    public static int charactersWithNoSpace(String text) {
        int letters = 0;
        char characters;
        char space = ' ';
        for (int i = 0; i < text.length(); i++) {
            characters = text.charAt(i);
            if (characters != space) {
                letters++;
            }
        }
        return letters;
    }
    public static boolean isPalindrom(String text) {
        String s = text.toLowerCase();
        return new StringBuilder(s).reverse().toString().equals(s);
    }
}
