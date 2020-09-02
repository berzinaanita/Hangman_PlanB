package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class PlayGame {

    private List<String> words = new ArrayList<>(Arrays.asList("cat", "cary", "farks", "haneyy"));
    private Random random = new Random();
    private String word = wordToGuess();

    public String getWord() {
        return word;
    }

    public String wordToGuess() {
        var word = random.nextInt(words.size());
        return words.get(word);
    }




}
