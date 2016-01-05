package newpackage;

import java.util.*;


import static java.util.Collections.frequency;

public class Dictionary {
    private HashMap<String, Integer> dictionary;
    private String[] data;

    public Dictionary(String input) {
        dictionary = new HashMap();
        if (input == null) {
            data = null;
        } else {
            data = input.toLowerCase().split(" ");
        }
    }

    public Map frecuaency() {
        if (data == null) {
            return null;
        } else {
            for (String word : data) {
                if (dictionary.containsKey(word)) {
                    dictionary.put(word, (int) dictionary.get(word) + 1);
                } else {
                    dictionary.put(word, 1);
                }
            }
        }
        return dictionary;
    }
}

/*
I feel shook
Everytime I close my eyes and travel
Into the place in the back of my mind
It's a place where memories hide and my thoughts combine
I see places and thousands of faces all at the same time
 */
