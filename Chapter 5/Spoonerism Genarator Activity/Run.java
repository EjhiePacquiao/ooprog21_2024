public class Run {
    public static void run() {
        String word1 = SpoonerismGenerator.getWord("word 1");
        String word2 = SpoonerismGenerator.getWord("word 2");


        int vowelIndex1 = VowelFinder.vowelIndex(word1);
        int vowelIndex2 = VowelFinder.vowelIndex(word2);

        // Check if both words have a vowel and start with consonants
        if (vowelIndex1 <= 0 || vowelIndex2 <= 0) {
            
            System.out.println(word1 + " and " + word2 + " are not good words to spoonerize.");
            return;
        }

        // Split the words into consonant and remaining parts
        String prefix1 = word1.substring(0, vowelIndex1);
        String restOfWord1 = word1.substring(vowelIndex1);
        String prefix2 = word2.substring(0, vowelIndex2);
        String restOfWord2 = word2.substring(vowelIndex2);

        // Swap the prefixes and create the spoonerized words
        String spoonerizedWord1 = prefix2 + restOfWord1;
        String spoonerizedWord2 = prefix1 + restOfWord2;

        // Print 
        System.out.println(word1 + " and " + word2 + " spoonerized are " + spoonerizedWord1 + " and " + spoonerizedWord2);
    }
}
