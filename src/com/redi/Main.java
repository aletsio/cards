package com.redi;

public class Main {

    public static void main(String[] args) {

        Admin admin = new Admin();

        admin.addAvailableLanguages();

        admin.addAdminSentences();

        admin.createUser();

        admin.getUserSettings();

        admin.askIfReady();

        admin.printWordQuestion(User.cardTypeWord);

        /*admin.print(User.name);
        admin.print(User.nativeLanguage);
        admin.print(User.targetLanguage);
        admin.print(User.wordOrSentence);
        admin.print(User.wordCategory);
        admin.print(User.cardTypeWord);
        admin.print(User.cardTypeSentence);*/

        //Adjective test = new Adjective(new AdjectiveIt("bello"),new AdjectiveEn("beautiful"),new AdjectiveDe("schön"),new AdjectiveEl("ωραίος"),new AdjectiveAr("حلو"));

        //admin.print(test.english.content);
    }
}