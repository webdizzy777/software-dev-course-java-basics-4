package org.example;

import com.sun.nio.sctp.AbstractNotificationHandler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CollectionExercises {
    public String[] makeFruitStringArray() {
        // EXAMPLE:
        // Create and return an array of strings with the following values:
        // "apple", "banana", "cherry", "date", "elderberry"
        // Replace the line below with your implementation
        String[] fruits = new String[5];
        fruits[0] = "apple";
        fruits[1] = "banana";
        fruits[2] = "cherry";
        fruits[3] = "date";
        fruits[4] = "elderberry";

        return fruits;
    }

    public String[] makeFruitStringArrayWithSize(int size) {
        // Create and return an array of strings with the given size (from the parameter)
        // Use a loop to set every element to "apple"
        // Replace the line below with your implementation
        String[] apples = new String[size];
        for (int i =0; i<size; i++) {
            apples[i] = "apple";
        }
        return apples;
    }

    public String[] makeTopThreeArray(String[] fruits) {
        // Create and return a new array of strings containing the first three elements of the given array
        // Replace the line below with your implementation
        String[] topThree = new String[3];
        topThree[0] =  fruits[0];
        topThree[1] =  fruits[1];
        topThree[2] =  fruits[2];
        return topThree;
    }

    public ArrayList<String> makeFruitList() {
        // Create and return an ArrayList of strings with the following values:
        // "apple", "banana", "cherry", "date", "elderberry"
        // Replace the line below with your implementation
        ArrayList<String> newFruits = new ArrayList<String>();
        newFruits.add("apple");
        newFruits.add("banana");
        newFruits.add("cherry");
        newFruits.add("date");
        newFruits.add("elderberry");
        return newFruits;
    }

    public ArrayList<String> makeListOfThreeFruits(String fruit1, String fruit2, String fruit3) {
        // Create and return an ArrayList of strings with the given values
        // Replace the line below with your implementation
        ArrayList<String> threeFruits= new ArrayList<String>();
        threeFruits.add(fruit1);
        threeFruits.add(fruit2);
        threeFruits.add(fruit3);
        return threeFruits;
    }

    public HashMap<String, String> makeFruitMap() {
        // Create and return a HashMap with the following key-value pairs:
        // "apple" -> "red", "banana" -> "yellow", "cherry" -> "red", "date" -> "brown", "elderberry" -> "black"
        // Replace the line below with your implementation
        HashMap<String, String> fruitColors = new HashMap<String, String>();
        fruitColors.put("apple", "red");
        fruitColors.put("banana", "yellow");
        fruitColors.put("cherry", "red");
        fruitColors.put("date", "brown");
        fruitColors.put("elderberry", "black");
        return fruitColors;
    }

    public String lookupAppleColor(HashMap<String, String> fruitMap) {
        // Return the value associated with the key "apple" in the given map, using the get method
        // Replace the line below with your implementation
        String appleValue = fruitMap.get("apple");
        return appleValue;
    }

    public HashSet<String> makeFruitSet(String fruit1, String fruit2, String fruit3) {
        // Create and return a HashSet of strings with the given values
        // Replace the line below with your implementation
        HashSet<String> Strings = new HashSet<String>();
        Strings.add(fruit1);
        Strings.add(fruit2);
        Strings.add(fruit3);
        return Strings;
    }
}
