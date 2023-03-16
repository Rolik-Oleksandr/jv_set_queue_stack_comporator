package org.example;

import java.util.Set;
import java.util.TreeSet;

public class SortLetters {
  private static final int MAX_UNIQUE_CHARS = 5;

  public String getUniqueCharacters(String text) {
    String cleanText = text.replaceAll("[^a-zA-Z]", "").toLowerCase();
    Set<Character> uniqueLetters = new TreeSet<>();

    for (int i = 0; i < cleanText.length(); i++) {
      uniqueLetters.add(cleanText.charAt(i));
    }

    StringBuilder sb = new StringBuilder();
    for (Character c : uniqueLetters) {
      if (sb.length() < MAX_UNIQUE_CHARS) {
        sb.append(c);
      } else {
        break;
      }
    }

    return sb.toString();
  }
}