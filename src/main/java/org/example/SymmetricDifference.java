package org.example;

import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference<T> {
  public Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
    Set<T> symmetricDifference = new HashSet<>(set1);
    symmetricDifference.addAll(set2);
    Set<T> temp = new HashSet<>(set1);
    temp.retainAll(set2);
    symmetricDifference.removeAll(temp);
    return symmetricDifference;
  }
}