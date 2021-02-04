package ua.com.foxminded.anagrams;

public class Anagram {

	private final String DELIMITER = "\\s+";
	
	public String anagram(String inputSentence) {
		validate(inputSentence);
		String[] inputWords = inputSentence.split(DELIMITER);
		String outputSentence = new String(inputSentence);

		for (int i = 0; i < inputWords.length; i++) {
			outputSentence = outputSentence.replaceFirst(inputWords[i], reversWord(inputWords[i]));
		}

		return outputSentence;
	}
	
	private static void validate(String inputSentence) {
        if (inputSentence == null) {
            throw new IllegalArgumentException("Sentence is null");
        }
        if (inputSentence.isEmpty()) {
            throw new IllegalArgumentException("Sentence is empty");
        }
        if (inputSentence.trim().isEmpty()) {
            throw new IllegalArgumentException("Sentence contain only whitespaces");
        }
    }

	private String reversWord(String inputWords) {
		char[] word = new char[inputWords.length()];
		int idxLeft = 0;
		int idxRight = word.length - 1;

		while (idxLeft <= idxRight) {
			if (!Character.isLetter(inputWords.charAt(idxLeft))) {
				word[idxLeft] = inputWords.charAt(idxLeft);
				idxLeft++;
			} else if (!Character.isLetter(inputWords.charAt(idxRight))) {
				        word[idxRight] = inputWords.charAt(idxRight);
				        idxRight--;
			} else if ((Character.isLetter(inputWords.charAt(idxLeft)))
					&& (Character.isLetter(inputWords.charAt(idxRight)))) {
				        word[idxLeft] = inputWords.charAt(idxRight);
				        word[idxRight] = inputWords.charAt(idxLeft);
				        idxLeft++;
				        idxRight--;
			}
		}

		return String.valueOf(word);
	}

}
