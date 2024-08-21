package LLD.WordProcessor;

import java.util.*;

public class LetterFactory {
    private static Map<Character, Letter> characterCache = new HashMap<>();
    public static Letter getLetterObj(Character character) {
        if (characterCache.containsKey(character)) {
            return characterCache.get(character);
        }
        else {
            Letter letter = new LetterImpl(character, "Ariel", 10);
            characterCache.put(character, letter);
            return letter;
        }
    }
}
