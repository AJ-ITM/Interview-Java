import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Java {

    public static void main(String[] args) {
        System.out.println("Hello World");

        //Comment

        /* Multi-line
        comment
         */

        // Primitive variables
        int myNum = 5;               // Integer (whole number)
        float myFloatNum = 5.99f;    // Floating point number
        char myLetter = 'D';         // Character
        boolean myBool = true;       // Boolean
        String myText = "Hello";     // String

        // Non-primitive data types: String, Arrays and Classes

        // declare multiple variables
        int x = 5, y = 6, z = 50;
        System.out.println(x + y + z);

        // Type casting
        // Widening Casting: smaller size -> larger size
        int myInt = 9;
        double myDouble = myInt;
        // Narrowing Casting
        double myDouble2 = 9.78d;
        int myInt2 = (int) myDouble;

        // Operators - Arithmetic: +, -, *, /, %, ++, --
        // Operators - Assignment: =, +=, -=, *=, /=, %=, &=, |=, ^=, >>=, <<=
        // Operators - Comparison: ==, !=, >, <, >=, <=
        // Operators - Logical: and &&, or ||, not !

        // String methods
        String txt = "abc";
        System.out.println(txt.length());
        System.out.println(txt.toLowerCase());
        System.out.println(txt.toUpperCase());
        System.out.println(txt.indexOf("b")); // =1

        // Concatenation: firstName + lastName or: forstName.concat(lastName)

        // Escape characters: \', \"
        // Special characters: \n New Line(unix+win), \r Carriage Return (mac+win), \t Tab, \b Backspace, \f Form Feed (new page for printer)

        // Random
        Math.random(); // returns a random number between 0.0 (inclusive), and 1.0 (exclusive)
        int randomNum = (int) (Math.random() * 101);  // 0 to 100

        // Loops
        int time = 9;
        if (time > 10) {
            // block of code to be executed if the condition is true
        } else if (time == 10) {
            // block of code to be executed if the condition is true
        } else {
            // block of code to be executed if the condition is false
        }

        // Short Hand If...Else: variable = (condition) ? expressionTrue : expressionFalse;

        // Switch statements
        switch (time) {
            case 11:
                // code block
                break;
            case 9:
                // code block
                break;
            default:
                // code block
        }

        // While
        while (time > 10) {
            // code block to be executed
        }
        do {
            // code block to be executed
        }
        while (time > 10);

        // For
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        // For-Each
        String[] cars1 = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars1) {
            System.out.println(i);
        }

        // Break
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }

        // Continue
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }

        // Arrays
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        int[] myNum2 = {10, 20, 30, 40};
        System.out.println(cars[0]);
        cars[0] = "Opel";
        System.out.println(cars.length);

        // Loop through Array
        for (String i : cars) {
            System.out.println(i);
        }

        // Multidimensional Arrays
        int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};
        System.out.println(myNumbers[1][2]); // Outputs 7
    }

    // Methods
    static void myMethod() {
        System.out.println("I just got executed!");
    }

    // Method parameter and arguments
    static void myMethodParams(String fname, int age) {
        System.out.println(fname + " is " + age);

        // Method overloading: multiple methods with the same name, but different parameters
        // int myMethod(int x)
        // float myMethod(float x)
        // double myMethod(double x, double y)
    }

    // Constructor
    public class Main2 {
        int x;  // Create a class attribute

        public Main2() {
            x = 5;  // Set the initial value for the class attribute x
        }

        public void main2(String[] args) {
            Main2 myObj = new Main2(); // Create an object of class Main (This will call the constructor)
            System.out.println(myObj.x); // Print the value of x
        }
    } // Outputs 5

    // Access Modifiers:
    // public:    Class, Package, Subclass, Global
    // protected: Class, Package, Subclass
    // default:   Class, Package
    // private:   Class

    // 4 Object-Language dogmas:
    // Encapsulation (grouping information)
    // Inheritance (sharing information)
    // Polymorphism (redefine information)
    // Abstraction (hiding information)

    // Encapsulation (sensitive data is hidden from users - Get / Set)
    public static class Person {
        private String name; // private = restricted access

        // Getter
        public String getName() {
            return name;
        }

        // Setter
        public void setName(String newName) {
            this.name = newName;
        }
    }

    // Inheritance (inherit attributes and methods from one class to another, subclass(child), superclass(parent))
    // class Car extends Vehicle {

    // Polymorphism (many forms, classes that are related to each other by inheritance)

    // Abstraction (hiding certain details and showing only essential information)
    // Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class)
    // Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from)
    abstract class Animal {
        public abstract void animalSound();

        public void sleep() {
            System.out.println("Zzz");
        }
    }

    // Interfaces (completely "abstract class" that is used to group related methods with empty bodies)
    interface Animal2 {
        public void animalSound(); // interface method (does not have a body)

        public void sleep(); // interface method (does not have a body)
    }

    class Pig implements Animal2 {    // Pig "implements" the Animal interface
        public void animalSound() {
            System.out.println("The pig says: wee wee"); // The body of animalSound() is provided here
        }

        public void sleep() {
            System.out.println("Zzz"); // The body of sleep() is provided here
        }
    }
    // Like abstract classes, interfaces cannot be used to create objects
    // Interface methods do not have a body - the body is provided by the "implement" class
    // On implementation of an interface, you must override all of its methods
    // Interface methods are by default abstract and public
    // Interface attributes are by default public, static and final
    // An interface cannot contain a constructor (as it cannot be used to create objects)

    // Enums (special "class" that represents a group of constants (unchangeable variables, like final variables))
    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }

    // User input (nextBoolean(), nextByte(), nextDouble(), nextFloat(), nextInt(), nextLine(), nextLong(), nextShort()
    class Input {
        public static void main(String[] args) {
            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter username");
            String userName = myObj.nextLine();  // Read user input
            System.out.println("Username is: " + userName);  // Output user input
        }
    }

    // Date and time + formatting
    public class Time {
        public static void main(String[] args) {
            LocalDateTime myDateObj = LocalDateTime.now();
            System.out.println("Before formatting: " + myDateObj);
            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
            String formattedDate = myDateObj.format(myFormatObj);
            System.out.println("After formatting: " + formattedDate);
        }
    }

    // Use an ArrayList for storing and accessing data, and LinkedList to manipulate data
    // ArrayList
    ArrayList<String> cars2 = new ArrayList<String>();
    // cars2.add("Volvo"), .get(0), set(0, "Volvo"), .remove(0), .clear(), .size()

    // LinkedList
    LinkedList<String> cars3 = new LinkedList<String>();
    // cars3.add("Volvo"), .get(0), set(0, "Volvo"), .remove(0), .clear(), .size()
    // cars3.addFirst(), addLast(), removeFirst(), removeLast(), getFirst(), getLast()

    // HashMap (key/value)
    public class Main {
        public static void main(String[] args) {
            HashMap<String, String> capitalCities = new HashMap<String, String>();
            capitalCities.put("England", "London");
            capitalCities.get("England");
            capitalCities.remove("England");
            capitalCities.clear();
            capitalCities.size();

            // Loop Through a HashMap
            // Print keys
            for (String i : capitalCities.keySet()) {
                System.out.println(i);
            }
            // Print values
            for (String i : capitalCities.values()) {
                System.out.println(i);
            }
            // Print keys and values
            for (String i : capitalCities.keySet()) {
                System.out.println("key: " + i + " value: " + capitalCities.get(i));
            }
        }
    }

    // HashSet (every item is unique)
    HashSet<String> cars = new HashSet<String>();
    // cars.contains("Mazda"), .remove("Volvo"), .clear(), .size()

    // Java Iterator (object that can be used to loop through collections, like ArrayList and HashSet)
    public class Main3 {
        public static void main(String[] args) {
            ArrayList<String> cars = new ArrayList<String>();
            cars.add("Volvo");
            Iterator<String> it = cars.iterator();
            System.out.println(it.next());
        }
    }

    // Wrapper Class: provide a way to use primitive data types (int, boolean, etc.) as objects
    // ArrayList<int> myNumbers = new ArrayList<int>(); // Invalid
    // ArrayList<Integer> myNumbers = new ArrayList<Integer>(); // Valid

    // Exceptions
    public class Main4 {
        public static void main(String[] args) {
            try {
                int[] myNumbers = {1, 2, 3};
                System.out.println(myNumbers[10]);
            } catch (Exception e) {
                System.out.println("Something went wrong.");
            } finally {
                System.out.println("The 'try catch' is finished.");
            }
        }

        static void checkAge(int age) {
            if (age < 18) {
                throw new ArithmeticException("Access denied - You must be at least 18 years old.");
            } else {
                System.out.println("Access granted - You are old enough!");
            }
        }
    }

    // Lambda
    // (parameter1, parameter2) -> { code block }
}
