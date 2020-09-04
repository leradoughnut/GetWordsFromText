package com.company;

import java.util.HashSet;

public class HashSetWithWords {
    private final HashSet<String> wordList;

    HashSetWithWords(){
        wordList = new HashSet<>();
    }

    public String toWordsString(){
        StringBuilder string = new StringBuilder();
        for (String s : wordList) {
            string.append(s);
            string.append(" ");
        }
        return string.toString();
    }

    public void divideText(String text){
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < text.length(); i++){
            if (isWordInASCII(text.charAt(i))){
                word.append(text.charAt(i));
            }
            else{
                if (WordFormat.isRightFormat(word.toString())){
                    wordList.add(WordFormat.truncToThirtyCharacters(word.toString()));
                }
                word.delete(0, word.length());
            }
        }
    }

    private boolean isWordInASCII(char character) {
        return (character > 64 && character < 91) || (character > 96 && character < 123);
    }
}
