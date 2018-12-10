package com.redi;

import java.util.ArrayList;

public class Noun {

    int ref;
    NounIt italian;
    NounEn english;
    NounDe german;
    NounEl greek;
    NounAr syrian;

    ArrayList<Sentence> samples = new ArrayList<>();

    public Noun(int ref, NounIt italian, NounEn english, NounDe german, NounEl greek, NounAr syrian) {
        this.ref = ref;
        this.italian = italian;
        this.english = english;
        this.german = german;
        this.greek = greek;
        this.syrian = syrian;
    }
}
