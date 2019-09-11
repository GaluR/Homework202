package service;

public class TextCounterService {

    public static int words(String text) {
        String[] temp = text.split(" ");
        return temp.length;
    }

    public static int signs(String text) {
        int letters = 0;
        char sign;
        for (int i = 0; i < text.length(); i++) {
            sign = text.charAt(i);
            letters++;
        }
        return letters;
    }

    public static int signsWithNoSpace(String text){
        int letters = 0;
        char sign;
        char spacja = ' ';
        for (int i = 0; i < text.length(); i++) {
            sign = text.charAt(i);
            if (sign != spacja) {
                letters++;
            }
        }
        return letters;
    }
}
