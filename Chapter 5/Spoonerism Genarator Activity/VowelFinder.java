class VowelFinder{
    public static int vowelIndex(String word) {
        for (int i = 0; i < word.length(); i++) {
            char c = word.toLowerCase().charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                return i;
            }
        }
        return -1; // Return -1 if no vowel is found
    }
    
 }
