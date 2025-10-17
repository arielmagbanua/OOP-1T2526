package oop.mmcm;

import java.util.LinkedList;
import java.util.Queue;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Queue<String> waitingLine = new LinkedList<>();

        // People getting in line (offer adds to the back)
        waitingLine.offer("Customer 1");
        waitingLine.offer("Customer 2");
        waitingLine.offer("Customer 3");

        System.out.println("Current waiting line: " + waitingLine);

        // Seeing who is at the front of the line
        System.out.println("Next to be served: " + waitingLine.peek());

        // Serving a customer (poll removes from the front)
        String servedCustomer = waitingLine.poll();
        System.out.println("Just served: " + servedCustomer);

        System.out.println("Remaining waiting line: " + waitingLine);

        // Serve the rest
        System.out.println("Serving: " + waitingLine.poll());
        System.out.println("Serving: " + waitingLine.poll());

        // The queue is now empty
        System.out.println("Is anyone left in line? " + waitingLine.peek()); // peek() returns null
    }
}