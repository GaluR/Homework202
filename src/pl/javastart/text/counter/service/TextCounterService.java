package pl.javastart.text.counter.service;

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
        return new StringBuilder(text).reverse().toString().equals(text);
    }
}
