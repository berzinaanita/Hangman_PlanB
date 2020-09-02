package com.company;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        GameField field = new GameField();
        PlayGame game = new PlayGame();
        var word = game.getWord(); // šis ir tas mainīgais, kas saņem random vārdu un saglabā
        char[] display = field.getWordToDisplay(word); // char array, kur saglabāts vārds kā ____
        int wrongLetter = 0;
        char[] wordToCharArray = word.toCharArray(); // pats vārds pārveidots par char array

        //pagaidām rakstu visu main klasē, bet pēc tam noteikti tās visas metodes var pārvietot uz citām klasēm

        for (var dis : display) {
            System.out.print(dis);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Try this letter: ");
        String letter = scanner.next();
        char[] updatedWord = userGuess(word, display, letter);



        var savedWord = userGuess(word, updatedWord, letter);

        for (var item: updatedWord) {
            System.out.print(item);
        }


    }

    private static char[] saveUpdatedWord(char[] updatedWord) { // metode, kas salīdzina divus __A_ un _C__ un saliek kopā tā, lai ir _CA_, bet man liekas, te kaut kas līdz galam nav pareizi
        char[] updatedWordSaved = new char[updatedWord.length];
        for (int i = 0; i < updatedWord.length; i++) {
            for (var item : updatedWord) {
                if (item != '_')
                    updatedWordSaved[i] += updatedWord[i];
            }

        }
        return updatedWordSaved;
    }

    private static char[] userGuess(String word, char[] display, String letter) { //metode, kas pievieno user ievadīto burtu minamajam vārdam
        char[] updatedWord = new char[word.length()];

        for (int i = 0; i < word.length(); i++) {
            var wordAsArray = word.toCharArray();
            if (wordAsArray[i] == letter.charAt(0)) {
                updatedWord[i] += letter.charAt(0);
            } else {
                updatedWord[i] += '_';
            }

        }
        return updatedWord;
    }

}
