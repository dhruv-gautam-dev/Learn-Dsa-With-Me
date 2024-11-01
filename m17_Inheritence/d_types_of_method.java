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
  }
}

/* Types of method in inheritance */
// 1.inherited
// 2.overridden
// 3.Specialized