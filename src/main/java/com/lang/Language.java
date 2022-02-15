package com.lang;

import java.util.*;

public class Language {
    List<String> wordsIds = new ArrayList<>();
    List<String> words = new ArrayList<>();
    ResourceBundle bundleEn = ResourceBundle.getBundle("resourses", new Locale("en", "US"));
    ResourceBundle bundleRu = ResourceBundle.getBundle("resourses", new Locale("ru", "RU"));
    Random rand = new Random();
    String id;

    public List<String> getWordsIds() {
        return wordsIds;
    }

    public List<String> getWords() {
        return words;
    }


    public List getWordsId(){
        for(int i=0; i<5; i++){
            id = String.valueOf(rand.nextInt(7)+1);
            wordsIds.add(id);
        }
        return wordsIds;
    }

    public List getWords(ArrayList wordsIds){
        for (Object word: wordsIds) {
            words.add(bundleEn.getString(String.valueOf(word)));

        }
        return words;
    }

    public void seeWords(ArrayList words){
        for (Object word: words) {
            System.out.println(word);
        }
    }
}
