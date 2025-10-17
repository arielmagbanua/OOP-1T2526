package oop.mmcm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        // always code to the interface (List) not the implementation (ArrayList)
//        List<String> fruits = new ArrayList<>();
//
//        // 1. adding elements
//        fruits.add("Apple");
//        fruits.add("Banana");
//        fruits.add("Cherry");
//        fruits.add("Apple"); // duplicates are allowed
//
//        System.out.println("My fruit list: " + fruits);
//
//        // 2. accessing an element by index (fast!)
//        String secondFruit = fruits.get(1); // Indices start at 0
//        System.out.println("The second fruit is: " + secondFruit);
//
//        // 3. removing an element
//        fruits.remove(2); // Removes "Apple" at index 0
//        System.out.println("List after removing element at index 0: " + fruits);
//
//        // 4. checking the size
//        System.out.println("The size of the list is: " + fruits.size());
//
//        // 5. iterating through the list
//        System.out.println("--- Iterating through the fruits ---");
//        for (String fruit : fruits) {
//            System.out.println(fruit);
//        }

        List<String> guestList = new LinkedList<>();

        // adding guests
        guestList.add("Alice");
        guestList.add("Bob");
        guestList.add("Charlie");

        System.out.println("Initial guest list: " + guestList);

        // adding an element at a specific position (fast in LinkedList)
        guestList.add(1, "Zoe"); // Add Zoe between Alice and Bob
        System.out.println("Guest list after adding Zoe: " + guestList);

        // removing an element is also fast
        guestList.remove("Bob");
        System.out.println("Guest list after Bob left: " + guestList);

        String guest = guestList.get(1);
        System.out.println("Chosen: " + guest);
    }
}
