package com.redi;

import java.util.ArrayList;

public class Word {

    String content;
    ArrayList<Integer> sampleSentences;
    char[] wordToCharArray = this.content.toCharArray();
    char[] displayWordToCharArray = wordToCharArray;

    // Constructor
    public Word(String content){
        this.content = content;
    }

}
