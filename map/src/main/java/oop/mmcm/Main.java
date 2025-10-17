package oop.mmcm;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        // map of student IDs (Integer) to student names (String)
//        Map<Integer, String> studentRoster = new HashMap<>();
//
//        // 1. adding key-value pairs using put()
//        studentRoster.put(101, "Alice");
//        studentRoster.put(205, "Bob");
//        studentRoster.put(315, "Charlie");
//
//        System.out.println("Student Roster: " + studentRoster);
//
//        // 2. getting a value by its key
//        String studentName = studentRoster.get(205);
//        System.out.println("Student with ID 205 is: " + studentName);
//
//        // 3. removing a pair by its key
//        studentRoster.remove(101);
//        System.out.println("Roster after removing ID 101: " + studentRoster);
//
//        // 4. checking if a key exists
//        if (studentRoster.containsKey(315)) {
//            System.out.println("ID 315 is in the roster.");
//        }
//
//        // 5. iterating over a map
//        System.out.println("--- Roster Iteration ---");
//
//        // entrySet() gives a set-view of the key-value pairs
//        for (Map.Entry<Integer, String> entry : studentRoster.entrySet()) {
//            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
//        }

        // TreeMap will sort entries by key
        Map<String, Integer> examScores = new TreeMap<>();

        examScores.put("Charlie", 88);
        examScores.put("Alice", 95);
        examScores.put("Bob", 72);
        examScores.put("Zoe", 95);

        // The entries are automatically sorted by the student's name (the key)
        System.out.println("Sorted exam scores: " + examScores);
    }
}