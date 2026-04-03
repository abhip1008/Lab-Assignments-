public class InterfaceDriver {

    public static void main(String[] args) {

        comparableDemo();
        cloneDemo();

    }

    // Demonstrates Comparable interface
    public static void comparableDemo() {

        Student s1 = new Student("Alice", 3.9);
        Student s2 = new Student("Bob", 3.4);

        System.out.println("Comparing Students by GPA:");

        int result = s1.compareTo(s2);

        if (result > 0) {
            System.out.println(s1 + " has a higher GPA than " + s2);
        }
        else if (result < 0) {
            System.out.println(s2 + " has a higher GPA than " + s1);
        }
        else {
            System.out.println("Both students have the same GPA.");
        }

        System.out.println();
    }

    // Demonstrates Cloneable interface
    public static void cloneDemo() {

        Student original = new Student("Charlie", 3.7);

        Student copy = original.clone();

        System.out.println("Original Student:");
        System.out.println(original);

        System.out.println("Cloned Student:");
        System.out.println(copy);

        System.out.println();

    }
}