package org.example;

import java.util.Set;

public class PangramChecker {
    public boolean check(String sentence){
        Set<Character> uniqueChars = getUniqueChars(sentence);
        if(uniqueChars.size() == 26) {
            return true;
        }
        return false;
    }

    public Set<Character> getUniqueChars(String sentence){
        return null;
    }
}