package com.redi;

import java.util.ArrayList;

public class Adjective {

    int ref;
    AdjectiveIt italian;
    AdjectiveEn english;
    AdjectiveDe german;
    AdjectiveEl greek;
    AdjectiveAr syrian;
    Adjective opposite;

    ArrayList<Sentence> samples = new ArrayList<>();

    public Adjective(int ref, AdjectiveIt italian, AdjectiveEn english, AdjectiveDe german, AdjectiveEl greek, AdjectiveAr syrian) {
        this.ref = ref;
        this.italian = italian;
        this.english = english;
        this.german = german;
        this.greek = greek;
        this.syrian = syrian;
    }
}
