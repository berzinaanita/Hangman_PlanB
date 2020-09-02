package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class GameField {

    private PlayGame game = new PlayGame();
    private String word = game.getWord();


    public char[] getWordToDisplay( String word ){
        char[] filler = new char[word.length()];

        for (int i = 0; i <word.length() ; i++) {
            filler[i] =  '_' ;
        }
        return filler;
    }



}

