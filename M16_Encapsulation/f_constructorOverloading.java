
class car { // extends object
  private String carName;
  private String carColor;

  // Three constructors with different parameters
  public car() { // 0 parameter

    // super(); // doesn't mean i write it or not it is written defaulted.
    this("Rohan", "red "); // looking for constructor in same class who takes two string, execute that and
                           // then come to this line.
    System.out.println("Default constructor is called ");
    carName = "Unknown";
    carColor = "none";
  }

  public car(String name) { // one parameter
    this(); // if this() method is there in constructor then super() is not present in it
            // when it is called it looks for constructor in same class with no parameter
            // execute it and
            // then come to this line.

    this.carName = name;
    carColor = "none";
  }

  public car(String name, String color) { // two parameter
    this.carName = name;
    this.carColor = color;
  }

  public void display() {
    System.out.println("Car Name:" + carName);
    System.out.println("Car Color:" + carColor);
  }

}

public class f_constructorOverloading {
  public static void main(String[] args) {
    car car1 = new car();
    car1.display();

    car car2 = new car("Swift");
    car2.display();

    car car3 = new car("Nexon", "Blue");
    car3.display();
  }
}

/* constructor overloading */
// writing different constructors with same name but different parameter is
// referred is 'constructor overloading'

// in it objects call its constructor by identifying {
// 1. no. of parameters passes in object ||
// 2. what is Data type of parameter passed.
// }

/** Super Method in constructor */
// it is involve default in every constructor even if we are not writing it but
// at backend it is available in every constructor.
// super() method is used to call the parent class constructor

/* this() method */
// if this() is present then super() method is absent in that class
// By default there is super() method, if you want to use this() method you have
// to write it in first line.
// used to call the constructor of same class.