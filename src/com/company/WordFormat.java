package com.company;

import java.util.regex.Pattern;

public class WordFormat {
    static boolean isRightFormat(String word){
        return Pattern.matches("^(?:([A-Za-z])(?!.*\\1))*$", word) && !word.isEmpty();
    }
     static String truncToThirtyCharacters (String word){
        return word.substring(0, Math.min(word.length(), 30));
     }
}
