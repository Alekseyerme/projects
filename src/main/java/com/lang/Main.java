package com.lang;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Language language = new Language();
        language.getWordsId();
        language.getWords((ArrayList) language.getWordsIds());
        language.seeWords((ArrayList) language.getWords());
    }
}
