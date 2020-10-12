package com.company;

import java.util.*;

public class TextManipulator {
    String text;
    int NumLetters;
    int NumVowels;
    int NumConsonants;

    public TextManipulator(String t){
        this.text = t;
    }

    public int NumSentences(){
        int sentenceCount = 0;

        if (text.length() != 0)
        {
            sentenceCount++;
            for (int i = 0; i < text.length()-1; i++) {
                if (text.charAt(i) == '.' || text.charAt(i) == '?' || text.charAt(i) == '!') {
                    if (text.charAt(i + 1) == ' ') {
                        sentenceCount++;
                        i++;
                    }
                }
            }
        }
        else System.out.println("Empty line");

        return sentenceCount;
    }

    public int NumWords(){
        int NumCount = 0;

        if (text.length() != 0)
        {
            NumCount++;

            for (int i = 1; i < text.length(); i++)
            {
                if(text.charAt(i) == ' ' && text.charAt(i-1) != ' ')
                {
                NumCount++;
                }
            }
        }
        else System.out.println("Empty line");

        return NumCount;
    }

    public void NumLetters(){

        if (text.length() != 0){
            for (int i = 0; i < text.length(); i++)
            {
                if (text.charAt(i) == 'A' || text.charAt(i) == 'a' || text.charAt(i) == 'E' || text.charAt(i) == 'e'
                    || text.charAt(i) == 'O' || text.charAt(i) == 'o' || text.charAt(i) == 'I' || text.charAt(i) == 'i'
                    || text.charAt(i) == 'U' || text.charAt(i) == 'u' || text.charAt(i) == 'Y' || text.charAt(i) == 'y')
                    {
                    NumLetters++;
                    NumVowels++;
                    }
                else if (text.charAt(i) == 'Q' || text.charAt(i) == 'q' || text.charAt(i) == 'W' || text.charAt(i) == 'w'
                        || text.charAt(i) == 'R' || text.charAt(i) == 'r' || text.charAt(i) == 'T' || text.charAt(i) == 't'
                        || text.charAt(i) == 'P' || text.charAt(i) == 'p' || text.charAt(i) == 'S' || text.charAt(i) == 's'
                        || text.charAt(i) == 'D' || text.charAt(i) == 'd' || text.charAt(i) == 'F' || text.charAt(i) == 'f'
                        || text.charAt(i) == 'G' || text.charAt(i) == 'g' || text.charAt(i) == 'H' || text.charAt(i) == 'h'
                        || text.charAt(i) == 'J' || text.charAt(i) == 'j' || text.charAt(i) == 'K' || text.charAt(i) == 'k'
                        || text.charAt(i) == 'L' || text.charAt(i) == 'l' || text.charAt(i) == 'Z' || text.charAt(i) == 'z'
                        || text.charAt(i) == 'X' || text.charAt(i) == 'x' || text.charAt(i) == 'C' || text.charAt(i) == 'c'
                        || text.charAt(i) == 'V' || text.charAt(i) == 'v' || text.charAt(i) == 'B' || text.charAt(i) == 'b'
                        || text.charAt(i) == 'N' || text.charAt(i) == 'n' || text.charAt(i) == 'M' || text.charAt(i) == 'm')
                    {
                    NumLetters++;
                    NumConsonants++;
                    }
            }
        }
        else System.out.println("Empty line");
    }

    public void printWordsInfo() {
        Map<String, Integer> word_array = new HashMap<>();

        String[] words = text.replaceAll("[(]|[)]|[.]|[,]|[;]|[:]|[\"]|[!]|[?]", "").split(" ");

        for (String word : words)
        {
            word = word.toLowerCase();
            int count = word_array.getOrDefault(word, 500);
            word_array .put(word, count + 1);
        }

        System.out.println("\nTop 5 words by frequency:");

        for (int i = 0; i < (Math.min(word_array .size(), 5)); i++) {
            int max = -1;
            String maxString = "";
            for (Map.Entry<String, Integer> entry : word_array.entrySet())
            {
                if (entry.getValue() > max)
                {
                    max = entry.getValue();
                    maxString = entry.getKey();
                }
            }
            System.out.println(maxString + " - " + max);
            word_array.put(maxString, -1);
        }

        Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));
        String[] uWords = new String[uniqueWords.size()];
        uniqueWords.toArray(uWords);
        Arrays.sort(uWords, Comparator.comparingInt(String::length).reversed());

        System.out.println("\nThe longest word:  " + uWords[0] + " - " + uWords[0].length() + " letters");


    }
}
