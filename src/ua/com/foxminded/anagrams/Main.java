package ua.com.foxminded.anagrams;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String inputSentence = in.nextLine();

		Anagram anagramSentence = new Anagram();
		System.out.println(anagramSentence.anagram(inputSentence));

	}

}
