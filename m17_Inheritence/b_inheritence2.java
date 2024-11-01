
class Human1 {
  int age;
  private String name;// does not take part in inheritance ,,, it is not inherit from here to Student1
                      // class

  Human1() { // constructors have same name as that of class.
             // also not take part in inheritance
    System.out.println("Human class constructor");
  }

  void sleep() {
    age = 20;
    System.out.println("Human needs good Sleep");
  }
}

class Student1 /* child class */ extends Human1 /* parent class */ {

  // Default constructor created by java

  // public student(){
  // super(); --> used to call the parent class constructor thats why constructer
  // is execute in output
  // }

  void display() {
    System.out.println("The age is:" + age);
    // System.out.println("The name is:" + name);
    /*
     * Note: age gives no error but name gives error
     * coz private members of class do not take part in inheritance
     */

  }
}

public class b_inheritence2 {
  public static void main(String[] args) {
    Student1 std1 = new Student1();
    std1.sleep(); // it proves that sleep method is also present in Student1 class

    std1.display();
  }
}

/* */
// to preserve the concept of Encapsulation they make sure that private members
// can not take part in inheritance.
