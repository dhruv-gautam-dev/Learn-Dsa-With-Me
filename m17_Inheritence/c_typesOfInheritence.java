
class Animal { // extends to object class automatically by java.
  void sleep() {
    System.out.println("Animal need sleep");
  }
}

class Tiger extends Animal { // example of single level inheritance
  void diet() {
    System.out.println("need meat to take nutrition");
  }
}

class Monkey extends Animal {

}

class Deer extends Animal {

}

/*
 * class Tiger, Monkey, Deer have same parent class and property of same parent
 * class which sets the example of Hierarchical inheritance
 */

class cat extends Tiger { // example of multi-Level inheritance || have property of both tiger and Animal
                          // class.

}

public class c_typesOfInheritence {
  public static void main(String[] args) {
    Tiger t = new Tiger();
    t.sleep(); // tiger class have property of Animal class

    cat c = new cat();
    c.sleep(); // cat also have the property of Animal class
    c.diet(); // cat class have property of Tiger class. || example of multi-level inheritance

  }
}

/* Types of inheritance */
// 1.Single Level inheritance
// 2.Multi-Level inheritance
// 3.Hierarchical inheritance
// 4.Multiple inheritance

/*
 * NOTE: multiple inheritance exits when a child class takes the properties of
 * two parent class which is not allowed in java programming as well as in real
 * life
 */

/*
 * if we do not give any parent to class then java automatically extends parent
 * class to a object class to parent class
 */