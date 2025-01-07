package dev.omuzalevska.kata_acronym;

public class Acronym {
    private final String phrase;

    Acronym(String phrase) {
        this.phrase = phrase;
    }

    String get() {
        // Видаляємо всe крім букв дефісів пробілів
        String cleanedPhrase = phrase.replaceAll("[^a-zA-Z\\s-]", "");

        // Розділяємо на слова по пробілах та дефісах
        String[] words = cleanedPhrase.split("[\\s-]+");

        StringBuilder acronym = new StringBuilder();
        for (String word : words) {
            // першa літерa кожного слова
            acronym.append(word.toUpperCase().charAt(0));
        }

    return acronym.toString();
}
    
}