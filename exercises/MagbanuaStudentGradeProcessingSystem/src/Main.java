import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Ask for number of students
        System.out.print("Enter number of students: ");
        int numStudents = sc.nextInt();
        sc.nextLine(); // consume newline

        // Step 2: Create arrays
        String[] names = new String[numStudents];
        double[] averages = new double[numStudents];
        char[] grades = new char[numStudents];

        // Step 3: Input data
        for (int i = 0; i < numStudents; i++) {
            System.out.print("\nEnter name of student #" + (i + 1) + ": ");
            names[i] = sc.nextLine();

            double total = 0;
            for (int j = 1; j <= 3; j++) {
                System.out.print("Enter quiz " + j + " score: ");
                double score = sc.nextDouble();
                total += score;
            }
            sc.nextLine(); // consume newline

            averages[i] = total / 3;

            // Step 4: Determine grade
            if (averages[i] >= 90) grades[i] = 'A';
            else if (averages[i] >= 80) grades[i] = 'B';
            else if (averages[i] >= 70) grades[i] = 'C';
            else if (averages[i] >= 60) grades[i] = 'D';
            else grades[i] = 'F';
        }

        // Step 5: Display results
        System.out.println("\nName               Average     Grade");
        System.out.println("--------------------------------------");
        for (int i = 0; i < numStudents; i++) {
            // format the name
            String[] segments = names[i].split(" ");

            for (int j = 0; j < segments.length; j++) {
                String segment = segments[j];

                // change the first character to upper case
                char firstChar = Character.toUpperCase(segment.charAt(0));
                segment = firstChar + segment.substring(1);

                segments[j] = segment;
            }

            String name = String.join(" ", segments);

            System.out.printf("%-18s %-10.2f %c%n", name, averages[i], grades[i]);
        }

        sc.close();
    }
}