
class Human { // super class // Base class // Parent class
  int age;

  void sleep() {
    age = 18;
    System.out.println("Human needs good sleep");
    System.out.println(age);
  }
}

class Student extends Human { // child class // Sub class // derived class.
                              // extends keyword is used to inherit or add all the properties and method of
                              // Human class to Student class
                              // 'is-a' relationship: Student 'is-a' Human

}

/*
 * NOTE: Both human and student are independent class they are independent of
 * each other
 */
public class a_inheritence_intro {
  public static void main(String[] args) {
    Student st1 = new Student(); // created an object of student class.
    // st1.sleep(); // it gives error coz sleep is not in Student class it is in
    // Human class.

    /*
     * NOTE: for solving above problem we use extend keyword in student class to
     * inherit the properties and methods of human class
     */

    st1.sleep(); // after using extends keyword we can call the method of another class i.e.
                 // Human
  }
}

/* Inheritance */
// this relationship is also called 'is-a' relationship.
// it is one of the pillar of object Orientation.
// it always speaks about reUsability.
// Using inheritance productivity of code is increased
// if we use inheritance line of code is decreased in the application
// in Java Inheritance is achieved through 'extends' keyword

/** Extends Keyword */
// if we use extends Keyword then we can take the properties methods of parent
// class to child class.