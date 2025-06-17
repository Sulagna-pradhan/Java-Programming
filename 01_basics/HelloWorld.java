/*

 1. This is the Boiler Template of java program
 2. This is the simplest Java program which displays "Hello, World!".
 3. It helps you understand the skeleton of every Java program.

 1️⃣  public class HelloWorld
     - 'public' means this class is accessible from anywhere.
     - 'class' is used to define a new class named 'HelloWorld'.
     - File name must match the class name in Java.

 2️⃣  public static void main(String[] args)
     - This is the **main method**, where the program starts execution.
     - 'public' → JVM needs to access this method.
     - 'static' → No need to create an object to run this method.
     - 'void' → This method doesn't return anything.
     - 'String[] args' → Accepts command-line arguments as an array of Strings.

 3️⃣  System.out.println("Hello, World!");
     - Used to print text on the console with a new line.
     - 'System' is a built-in Java class.
     - 'out' is a static object of PrintStream class.
     - 'println()' prints the message and moves the cursor to the next line.
*/

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
