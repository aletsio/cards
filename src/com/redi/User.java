package com.redi;

public class User {

    static String name;
    static String nativeLanguage;
    static String targetLanguage;
    static int wordOrSentence;
    static int wordCategory;
    static int cardTypeWord;
    static int cardTypeSentence;
    double score;

    // Constructor
    public User(String name, String nativeLanguage, String targetLanguage){
        this.name = name;
        this.nativeLanguage = nativeLanguage;
        this.targetLanguage = targetLanguage;
    }

}
