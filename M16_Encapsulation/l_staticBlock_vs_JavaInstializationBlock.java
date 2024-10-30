public class l_staticBlock_vs_JavaInstializationBlock {

  static int age; // static variable

  static { // Block to initialize static variable.
    System.out.println("Static Block");
    age = 20;
  }

  static void display() { // static method.
    System.out.println("static display() method ");
    System.out.println(age);
  }

  public static void main(String[] args) { // it is static as well as main, so it executes before static
    System.out.println("Main method");

    display(); // invoking display method which is static.
  }
}

/** output is : */
// Static Block
// Main method
// static display() method
// 20