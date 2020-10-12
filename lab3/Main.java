package com.company;

public class Main {

    public static void main(String[] args) {

        TextManipulator Text = new TextManipulator("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer ac libero ac massa vulputate aliquet vel nec ante. Fusce non justo eu leo congue ultricies non sed dui. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Quisque quis tincidunt nulla. Vestibulum non finibus felis. Maecenas dolor purus, fermentum vitae lacus vel, ultrices pharetra nulla. Pellentesque nec facilisis lectus, eu faucibus enim. Fusce quis auctor mauris, quis pharetra est. Ut consectetur nunc leo, ut eleifend velit commodo eget. Praesent ac ante ut nisl bibendum dictum et ut orci. Donec dignissim purus eget est congue, quis pulvinar mauris.");

        System.out.println("Number of sentences:  " + Text.NumSentences());
        System.out.println("Number of words:  " + Text.NumWords());

        Text.NumLetters();
        System.out.println("Number of letters:  " + Text.NumLetters);
        System.out.println("Number of Vowels:  " + Text.NumVowels);
        System.out.println("Number of Consonants:  " + Text.NumConsonants);

        Text.printWordsInfo();
    }
}
