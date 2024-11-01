class Airplane {
  public void takeOff() {
    System.out.println("Plane is ready to take off");
  }

  public void fly() { // this method is called overridden because it is inherit and modified in child
    // class accordingly.
    System.out.println("plane is flying now ");
  }
}

class cargoPlane extends Airplane {
  public void fly() {
    System.out.println("plane is flying at lower height "); // This method is overriding method because it is modified
                                                            // accordingly.
  }

  public void carryGoods() {
    System.out.println("cargoPlane contains goods");
  }
}

class passengerPlane extends Airplane {
  public void fly() {
    System.out.println("plane is flying at medium height "); // This method is overriding method because it is modified
                                                             // accordingly.
  }

  public void carryPassenger() { // Such method which are not in their parent class and are only present in the
                                 // child class are called specialized method.
    System.out.println("passengerPlane contains passenger");
  }
}

public class d_types_of_method {
  public static void main(String[] args) {
    System.out.println("Types of methods in inheritance ");

    // parent class objects have the capability to hold the child class object

    cargoPlane cp = new cargoPlane();
    passengerPlane pp = new passengerPlane();
    Airplane a1;
    // cp = pp; ---> it gives error because both are child class and cp can not
    // handle pp

    a1 = cp;// ---> it gives no error because a1 is of parent class and can handle child
            // class object

    a1.fly();// it execute method of cargoPlane class
    a1.takeOff();
    System.out.println("-------------------------------------------------------");
    a1 = pp;// ---> it gives no error because a1 is of parent class and can handle child
            // class object

    a1.fly();// it execute method of passengerPlane class
    a1.takeOff();
  }
}

/* Types of method in inheritance */
// 1.inherited
// 2.overridden
// 3.Specialized

// as fly() method exits in multiple form as in line no.51 and in line no. 56.
// it means it is an example of polymorphism
