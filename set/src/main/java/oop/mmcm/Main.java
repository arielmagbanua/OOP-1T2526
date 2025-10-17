package oop.mmcm;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Set<String> uniqueTags = new HashSet<>();

        // 1. adding elements
        uniqueTags.add("Java");
        uniqueTags.add("Programming");
        uniqueTags.add("Code");
        uniqueTags.add("Programming");

        // 2. trying to add a duplicate element
        boolean isAdded = uniqueTags.add("Java"); // This will return false
        System.out.println("Was 'Java' added again? " + isAdded);
        System.out.println("The set of tags: " + uniqueTags); // Note: Order is not guaranteed

        // 3. checking if an element exists (very fast!)
        if (uniqueTags.contains("Code")) {
            System.out.println("The set contains the 'Code' tag.");
        }

        // 4. removing an element
        uniqueTags.remove("Programming");
        System.out.println("Set after removing 'Programming': " + uniqueTags);


        // TreeSet stores elements in natural sorted order
        Set<Integer> sortedNumbers = new TreeSet<>();

        sortedNumbers.add(50);
        sortedNumbers.add(10);
        sortedNumbers.add(99);
        sortedNumbers.add(35);

        sortedNumbers.contains(35);
        sortedNumbers.remove(99);

        // The elements are automatically sorted!
        System.out.println("The sorted set of numbers: " + sortedNumbers);
    }
}