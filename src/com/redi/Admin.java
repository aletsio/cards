package com.redi;

import java.util.*;

public class Admin {

    ArrayList<Sentence> adminSentences = new ArrayList<>(); // Multilingual texts used by the admin to communicate with the user

    ArrayList<Sentence> availableLanguages = new ArrayList<>(); // Languages which can be selected by the user

    ArrayList<Sentence> languagesToPractice = new ArrayList<>(); // Languages available as practice languages (dynamic: all available languages minus the user's native language)

    ArrayList<Sentence> userSentences = new ArrayList<>(); // The sentences used in the cards

    public void addAvailableLanguages() {
        this.availableLanguages.add(new Sentence(0,
                "italiano",
                "Italian",
                "Italienisch",
                "Ιταλικά",
                "ايطالي"));
        this.availableLanguages.add(new Sentence(1,
                "inglese",
                "English",
                "Englisch",
                "Αγγλικά",
                "اينكليزي"));
        this.availableLanguages.add(new Sentence(2,
                "tedesco",
                "German",
                "Deutsch",
                "Γερμανικά",
                "الماني"));
        this.availableLanguages.add(new Sentence(3,
                "greco",
                "Greek",
                "Griechisch",
                "Ελληνικά",
                "يوناني"));
        this.availableLanguages.add(new Sentence(4,
                "arabo siriano",
                "Syrian Arabic",
                "Syrisch Arabisch",
                "Αραβικά της Συρίας",
                "شامي"));
    }

    public void addAdminSentences(){
        this.adminSentences.add(new Sentence(
                0,
                "Ok, parliamo italiano allora! Con quale lingua vuoi esercitarti? Scegli tra ",
                "Ok, let's speak English then! Which language would you like to practice? Choose between ",
                "Ok, lass uns Deutsch sprechen! Welche Sprache möchtest du üben? Wähle zwischen ",
                "Εντάξει, μιλάμε Ελληνικά τότε! Σε ποια γλώσσα θέλεις να εξασκηθείς; Επίλεξε ανάμεσα ",
                "تمام, خلينا نحكي عربي! اي لغة بدك تتمرن؟ وحدة بين "));
        this.adminSentences.add(new Sentence(
                1,
                "e",
                "and",
                "und",
                "και",
                "و"));
        this.adminSentences.add(new Sentence(
                2,
                "Perfetto! Ora dimmi cosa ti piacerebbe fare.",
                "Perfect! Now tell me what you would like to do.",
                "Perfekt! Jetzt sag mir, was du machen möchtest.",
                "Τέλεια! Τώρα πες μου τι θέλεις να κάνεις.",
                "شششششششششششششششششششششششششششش"));
        this.adminSentences.add(new Sentence(
                3,
                "Vuoi esercitarti con le parole o con le frasi? Se vuoi che scelga io per te, scrivi RANDOM.",
                "Would you like to practice with words or sentences? If you want me to choose for you, just type RANDOM.",
                "Willst du mit Wörtern oder Sätzen üben? Ich kann auch für dich wählen, wenn du RANDOM schreibst.",
                "Θέλεις να ασκηθείς με λέξεις ή με προτάσεις; Αν θέλεις να αποφασίσω εγώ για σένα, γράψε RANDOM.",
                "بدك كلمات ولا اجمال؟ random؟"));
        this.adminSentences.add(new Sentence(
                4,
                "Scegli la categoria: aggettivi, sostantivi o verbi? Se vuoi un po' di tutto, scrivi RANDOM.",
                "Choose the category: adjectives, nouns or verbs? If you want a little of everything, just type RANDOM.",
                "Wähle eine Kategorie: Adjektive, Substantive oder Verben? Wenn du ein wenig von jedem willst, schreib einfach RANDOM.",
                "Επίλεξε μια κατηγορία: επίθετα, ουσιαστικά ή ρήματαُ; Αν θέλεις λίγο απ'όλα, γράψε RANDOM.",
                "Choose category (Arabic TBT)"));
        this.adminSentences.add(new Sentence(
                5,
                "Scegli il tipo di carta: \na) parola da digitare, mostra lettere in ordine dopo tentativi errati \nb) parola da digitare, mostra lettere casuali dopo tentativi errati \nc) risposta multipla \nr) casuale.",
                "Choose the type of card: \na) type in the word, view letters after wrong answers \nb) type in the word, view random letters after wrong answers \nc) multiple choice \nr) random.",
                "Choose word card type (German TBT)",
                "Choose word card type (Greek TBT)",
                "Choose word card type (Arabic TBT)"));
        this.adminSentences.add(new Sentence(
                6,
                "Mmm non è esattamente ciò che mi aspettavo. Riprova!",
                "Hmm that's not what I was expecting. Try again!",
                "Hmm das ist nicht genau was ich erwartete. Probiere noch einmal!",
                "Χμμ δεν είναι ό,τι περίμενα. Δοκίμασε ξανά!",
                "Try again (Arabic TBT)"));
        this.adminSentences.add(new Sentence(
                7,
                "Scegli il tipo di carta: a) abbina le due metà della frase, b) riordina le parole per formare una frase, r) casuale",
                "Choose the type of card: \na) match the two halves of the sentence \nb) sort words to make a sentence \nr) random",
                "Choose sentence card type (German TBT)",
                "Choose sentence card type (Greek TBT)",
                "Choose sentence card type (Arabic TBT)"));
        this.adminSentences.add(new Sentence(
                8,
                "Ho scelto parole!",
                "I chose words!",
                "Ich habe Woerter gewaehlt!",
                "Επίλεξα λέξεις!",
                "I chose words (Arabic TBT)"));
        this.adminSentences.add(new Sentence(
                9,
                "Ho scelto frasi!",
                "I chose sentences!",
                "Ich habe Saetze gewaehlt!",
                "Επίλεξα προτάσεις!",
                "I chose sentences (Arabic TBT)"));
        this.adminSentences.add(new Sentence(
                10,
                "Grazie! Ora possiamo cominciare. Sei pronto?",
                "Thank you! Now we can start. Ready?",
                "Danke! Jetzt können wir anfangen. Bist bu bereit?",
                "Ευχαριστώ! Τώρα μπορούμε να ξεκινήσουμε. Είσαι έτοιμος;",
                "Ready? (Arabic TBT)"));
        this.adminSentences.add(new Sentence(
                11,
                "Ok, aspetto! Quando sei pronto scrivi qualcosa e iniziamo subito!",
                "Ok, I'll wait! When you're ready, type anything and we'll start right away!",
                "Ok, ich warte denn. Sobald du bereit bist, schreib etwas und es geht los!",
                "Εντάξει, θα περιμένω. Μόλις είσαι έτοιμοσ, γράψε κάτι και θα ξεκινήσουμε αμέσως!",
                "I'll wait (Arabic TBT)"));
        this.adminSentences.add(new Sentence(
                12,
                "Come si traduce questa parola?",
                "How would you translate this word?",
                "Wie würdest du diese Wort übersetzen?",
                "Πώς θα μετάφραζες αυτή τη λέξη;",
                "Translate (Arabic TBT)"));
        this.adminSentences.add(new Sentence(
                13,
                "Qual è il contrario di questa parola?",
                "What's the opposite of this word?",
                "Was ist das Gegenteil dieses Wortes?",
                "Ποιο είναι το αντίθετο αυτής της λέξης;",
                "Opposite (Arabic TBT)"));
        this.adminSentences.add(new Sentence(
                14,
                "Trova la seconda metà della frase:",
                "Find the second half of the sentence:",
                "Finde die zweite Hälfte des Satzes:",
                "Βρες τη δεύτερη μέση της πρότασης:",
                "Find second half (Arabic TBT)"));
        this.adminSentences.add(new Sentence(
                15,
                "Riordina le parole per formare una frase:",
                "Sort the words to make a sentence:",
                "Schreib die Wörter in der richtigen Reihenfolge:",
                "Βάλε τις λέξεις στη σοστή σειρά για να φτιάξεις μια πρόταση:",
                "Sort words (Arabic TBT)"));
        this.adminSentences.add(new Sentence(
                16,
                "Quale parola manca in questa frase?",
                "What's the missing word in this sentence?",
                "Welches Wort fehlt in diesem Satz?",
                "Ποια λέξει λείπει σ'αυτή την πρόταση;",
                "Missing word (Arabic TBT)"));
    }

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    Timer timer = new Timer();

    // Write something.
    public void print(Object output){
        System.out.println(output);
    }

    // Ask the user for their name, native language and target language and create a new user with these attributes.
    public void createUser(){
        print("Hello! What's your name?");
        String name = scanner.next();
        print("Nice to meet you, " + name + "! What's your native language? Choose between Italian, English, German, Greek and Syrian Arabic.");
        Sentence nativeLanguage;
        nativeLanguage = chooseLanguage();
        // Create a list of available practice languages by removing the user's native language from the list of available languages.
        for(Sentence language : availableLanguages){
            if(!language.equals(nativeLanguage)) {
                languagesToPractice.add(language);
            }
        }
        print(getAdminSentence(0,nativeLanguage.English)
                + getLanguage(languagesToPractice.get(0).ref,nativeLanguage) + ", "
                + getLanguage(languagesToPractice.get(1).ref,nativeLanguage) + ", "
                + getLanguage(languagesToPractice.get(2).ref,nativeLanguage) + " "
                + getAdminSentence(1,nativeLanguage.English) + " "
                + getLanguage(languagesToPractice.get(3).ref,nativeLanguage) + ".");
        Sentence targetLanguage = chooseLanguage();
        User user = new User(name,nativeLanguage.English,targetLanguage.English);
        user.score = 0;
        print(getAdminSentence(2,nativeLanguage.English));
    }

    // General method to get all user settings in the right order
    public void getUserSettings(){
        getWordOrSentence();
        if(User.wordOrSentence==1){
            getWordCategory();
            getTypeOfCardWord();
        }else{
            getTypeOfCardSentence();
        }
    }

    // Let the user choose between words and adminSentences and set the corresponding user attribute wordOrSentence.
    public void getWordOrSentence(){
        print(getAdminSentence(3,User.nativeLanguage));
        User.wordOrSentence = -1;
        String answer;
        do {
            answer = scanner.next();
            if (answer.toLowerCase().contains("wo")) {
                User.wordOrSentence = 1;
            } else if (answer.toLowerCase().contains("sen")) {
                User.wordOrSentence = 2;
            } else if (answer.toLowerCase().contains("ra")) {
                User.wordOrSentence = random(2)+1;
                if(User.wordOrSentence == 1){
                    print(getAdminSentence(8,User.nativeLanguage));
                }else{
                    print(getAdminSentence(9,User.nativeLanguage));
                }
            } else {
                print(getAdminSentence(6,User.nativeLanguage));
            }
        }while(User.wordOrSentence == -1);
    }

    // Let the user choose between adjectives, nouns and verbs and set the corresponding user attribute wordCategory.
    public void getWordCategory(){
        print(getAdminSentence(4,User.nativeLanguage));
        String answer = scanner.next();
        if(answer.toLowerCase().contains("adj") || answer.toLowerCase().contains("ag") || answer.toLowerCase().contains("επ")){
            User.wordCategory = 1;
        }else if(answer.toLowerCase().contains("sub") || answer.toLowerCase().contains("ουσ") || answer.toLowerCase().contains("no") || answer.toLowerCase().contains("so")) {
            User.wordCategory = 2;
        }else {
            User.wordCategory = 0;
        }
    }

    // Let the user choose the type of card for words and set the corresponding user attribute cardTypeWord.
    public void getTypeOfCardWord(){
        print(getAdminSentence(5,User.nativeLanguage));
        User.cardTypeWord = -1;
        do {
            String answer;
            answer = scanner.next();
            if (answer.equalsIgnoreCase("a")) {
                User.cardTypeWord = 1;
            } else if (answer.equalsIgnoreCase("b")) {
                User.cardTypeWord = 2;
            } else if (answer.equalsIgnoreCase("c")) {
                User.cardTypeWord = 3;
            } else if (answer.equalsIgnoreCase("r")) {
                User.cardTypeWord = 0;
            } else {
                print(getAdminSentence(6, User.nativeLanguage));
            }
        }while(User.cardTypeWord == -1);
    }

    // Let the user choose the type of card for sentences and set the corresponding user attribute cardTypeSentence.
    public void getTypeOfCardSentence(){
        print(getAdminSentence(7,User.nativeLanguage));
        User.cardTypeSentence = -1;
        String answer;
        do {
            answer = scanner.next();
            if (answer.equalsIgnoreCase("a")) {
                User.cardTypeSentence = 1;
            } else if (answer.equalsIgnoreCase("b")) {
                User.cardTypeSentence = 2;
            } else if (answer.equalsIgnoreCase("r")) {
                User.cardTypeSentence = 0;
            } else {
                print(getAdminSentence(6, User.nativeLanguage));
            }
        }while(User.cardTypeSentence == -1);
    }

    // Add a sentence to the array of userSentences.
    public void addUserSentence(int ref, String Italian, String English, String German, String Greek, String Syrian){
        userSentences.add(new Sentence(ref,Italian,English,German,Greek,Syrian));
    }

    // Return the sentence at the specified index of the array adminSentences in the specified language.
    public String getAdminSentence(int ref, String language) {
        if (language.equals("Italian")) {
            return adminSentences.get(ref).Italian;
        } else if (language.equals("English")) {
            return adminSentences.get(ref).English;
        } else if (language.equals("German")) {
            return adminSentences.get(ref).German;
        } else if (language.equals("Greek")) {
            return adminSentences.get(ref).Greek;
        } else {
            return adminSentences.get(ref).Syrian;
        }
    }

    // Return the sentence at the specified index of the array userSentences in the specified language.
    public String getUserSentence(int ref, String language) {
        if (language.equals("Italian")) {
            return userSentences.get(ref).Italian;
        } else if (language.equals("English")) {
            return userSentences.get(ref).English;
        } else if (language.equals("German")) {
            return userSentences.get(ref).German;
        } else if (language.equals("Greek")) {
            return userSentences.get(ref).Greek;
        } else {
            return userSentences.get(ref).Syrian;
        }
    }

    // Return the sentence at the specified index of the array availableLanguages in the specified language.
    public String getLanguage(int ref, Sentence language) {
        if (language.equals(availableLanguages.get(0))) {
            return availableLanguages.get(ref).Italian;
        } else if (language.equals(availableLanguages.get(1))) {
            return availableLanguages.get(ref).English;
        } else if (language.equals(availableLanguages.get(2))) {
            return availableLanguages.get(ref).German;
        } else if (language.equals(availableLanguages.get(3))) {
            return availableLanguages.get(ref).Greek;
        } else {
            return availableLanguages.get(ref).Syrian;
        }
    }

    // Let the user pick a language, allowing for some mistakes and short forms.
    public Sentence chooseLanguage(){
        Sentence chosenLanguage = null;
        String typedLanguage;
        do {
            typedLanguage = scanner.next();
            if (typedLanguage.equalsIgnoreCase("italian") || typedLanguage.toLowerCase().contains("it") || typedLanguage.toLowerCase().contains("ιτ") || typedLanguage.toLowerCase().contains("ايت")) {
                chosenLanguage = availableLanguages.get(0);
            } else if (typedLanguage.equalsIgnoreCase("english") || typedLanguage.toLowerCase().contains("en") || typedLanguage.toLowerCase().contains("in") || typedLanguage.toLowerCase().contains("αγ") || typedLanguage.toLowerCase().contains("اين")) {
                chosenLanguage = availableLanguages.get(1);
            } else if (typedLanguage.equalsIgnoreCase("german") || typedLanguage.toLowerCase().contains("ge") || typedLanguage.toLowerCase().contains("ال") || typedLanguage.toLowerCase().contains("γε") || typedLanguage.toLowerCase().contains("te")) {
                chosenLanguage = availableLanguages.get(2);
            } else if (typedLanguage.equalsIgnoreCase("greek") || typedLanguage.toLowerCase().contains("gr") || typedLanguage.toLowerCase().contains("ελ") || typedLanguage.toLowerCase().contains("يو")) {
                chosenLanguage = availableLanguages.get(3);
            } else if (typedLanguage.equalsIgnoreCase("arabic") || typedLanguage.toLowerCase().contains("sy") || typedLanguage.toLowerCase().contains("ar") || typedLanguage.toLowerCase().contains("سو") || typedLanguage.toLowerCase().contains("شا") || typedLanguage.toLowerCase().contains("αρ") || typedLanguage.toLowerCase().contains("si")) {
                chosenLanguage = availableLanguages.get(4);
            } else {
                print("I think you typed the wrong language or misspelled it. Choose one of the available languages (you can also just type the first letters of its name).");
            }
        }while(chosenLanguage==null);
        return chosenLanguage;
    }

    // Return a random number from 0 to max-1.
    public int random(int max){
        return random.nextInt(max);
    }

    // Print a countdown.
    public void countdown(){
        timer.schedule(new TimerTask() {
            public void run() {
                print(3);
            }
        }, 1000);
        timer.schedule(new TimerTask() {
            public void run() {
                print(2);
            }
        }, 2000);
        timer.schedule(new TimerTask() {
            public void run() {
                print(1);
            }
        }, 3000);
        timer.schedule(new TimerTask() {
            public void run() {
                print("*************************************");
            }
        }, 4000);
    }

    // Ask the user if they are ready to start and, if not ready, wait for their input.
    public void askIfReady(){
        print(getAdminSentence(10,User.nativeLanguage));
        String answer = scanner.next();
        if(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("sì") || answer.equalsIgnoreCase("si") || answer.equalsIgnoreCase("sure") || answer.equalsIgnoreCase("of course") || answer.equalsIgnoreCase("i am") || answer.equalsIgnoreCase("ja") || answer.equalsIgnoreCase("natürlich") || answer.equalsIgnoreCase("pronto") || answer.equalsIgnoreCase("ναι") || answer.equalsIgnoreCase("έτοιμος") || answer.equalsIgnoreCase("έλα") || answer.equalsIgnoreCase("vai") || answer.equalsIgnoreCase("los") || answer.equalsIgnoreCase("اي") || answer.equalsIgnoreCase("اية") || answer.equalsIgnoreCase("نعم") || answer.equalsIgnoreCase("يالَه")){
            countdown();
        }else{
            print(getAdminSentence(11,User.nativeLanguage));
            scanner.next();
            countdown();
        }
    }

    //
    public void printWordQuestion(int wordCategory){
        int random;
        int temporaryWordOrCategory;
        int ref;
        if(wordCategory==0){
            wordCategory=random(2)+1;
        }
        if(wordCategory==1) {
            random = random(3);
        }else{
            random = random(2);
        }
        if(random==0){
            ref = 12;
        }else if(random==1){
            ref = 16;
        }else{
            ref = 13;
        }
        print(getAdminSentence(ref,User.nativeLanguage));
    }


}
