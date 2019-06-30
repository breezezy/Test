package webs;

import java.util.Scanner;
import web.EnglishChinese;
import web.EnglishChineseSoap;

public class TransClient {

    public static void main(String[] args) {

        EnglishChinese englishChinese = new EnglishChinese();
        EnglishChineseSoap englishChineseSoap = englishChinese.getEnglishChineseSoap();
        System.out.println("please  words:");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(englishChineseSoap.translatorString(str).getString());

        System.out.println(englishChineseSoap.translatorSentenceString(str).getString());
    }

}
