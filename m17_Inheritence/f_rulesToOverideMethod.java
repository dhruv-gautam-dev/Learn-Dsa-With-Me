
class Animal1 {
  public void eat() {
    System.out.println("Animal eats every day");
  }
}

class Tiger1 extends Animal1 {
  public void eat() {
    System.out.println("Tiger hunts and eat");
  }
}

public class f_rulesToOverideMethod {
  public static void main(String[] args) {
    Tiger1 t1 = new Tiger1();
    t1.eat(); // output:|| Animal eats every day|| means inheritance executed successfully.
              // Output after overriding : ||Tiger hunts and eat.
  }
}
/* Rules to overriding Method */
// we can increase but can not reduce the visibility of method during
// overriding.
// can not change the return type of method from parent class to child class.
// during overriding argument of method in parent class and child class should
// be equal and same . if it happens then there is newly created method in child
// class with different parameter.