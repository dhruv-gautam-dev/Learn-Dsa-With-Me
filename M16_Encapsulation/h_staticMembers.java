class Demo1 {

  static int a; // static variable
  static int b;

  int c; // non-static variable.
  int d;

  static { // initialization of static variable.
    System.out.println("control in static Block");
    a = 10; // memory is created directly in heap
    b = 20;
  }

  { // initialization of non-static variable.
    System.out.println("control in non-static Block");
    c = 30; // instance variable || non-static variable || memory is allocated only after
            // creating object .
    d = 40;
  }

  static void displayStatic() { // use static method to print static members
    // can call this method directly without using an object , by directly class.
    System.out.println("value of static variable a:" + a);
    System.out.println("value of static variable b:" + b);
  }

  void displayNonStatic() { // use static method to print static members
    // can call this method directly without using an object , by directly class.
    System.out.println("value of non-static variable c:" + c);
    System.out.println("value of non-static variable d:" + d);
  }
}

public class h_staticMembers {
  public static void main(String[] args) {
    System.out.println("control in main");
    Demo1.displayStatic(); // can call it directly without using object to check the static variable in
                           // heap memory

    Demo1 obj1 = new Demo1();
    obj1.displayNonStatic(); // nonStatic method take object to run as obj1.

  }
}
