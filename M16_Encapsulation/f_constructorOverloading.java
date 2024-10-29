package M16_Encapsulation;

class car {
  private String carName;
  private String carColor;

  // Three constructors with different parameters
  public car() { // 0 parameter
    System.out.println("Default constructor is called ");
    carName = "Unknown";
    carColor = "none";
  }

  public car(String name) { // one parameter
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