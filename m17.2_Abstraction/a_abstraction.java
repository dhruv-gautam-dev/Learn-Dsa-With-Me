
/*if there is any method with abstract keyword in  a class then it is necessary to make class abstract */

// there can be abstract class, abstract method but never be abstract variable and constructor
abstract class Airplane3 {

  /***
   * as this class is a parent class but the thing is all the methods of this
   * class are override in its child class so it does not make sense that why we
   * are using body of these methods when no one is executing this.
   */
  /*
   * so for the method which have no body are called abstraction method and starts
   * with abstract keyword
   */
  abstract public void takeOff();
  // {
  // System.out.println("Plane is ready to take off");
  // }

  abstract public void fly();
  // { // this method is called overridden because it is inherit and modified in
  // child
  // // class accordingly.
  // System.out.println("Airplane is flying now ");
  // }

  public void landing() { // by adding non- abstraction method it becomes impure abstraction
    System.out.println("Airplane is landing");
  }
}

class cargoPlane3 extends Airplane3 {
  public void fly() {
    System.out.println("cargoPlane is flying at lower height "); // This method is overriding method because it is
                                                                 // modified
    // accordingly.
  }

  public void takeOff() {
    System.out.println("cargoPlane require longer runWay");
  }

  public void carryGoods() {
    System.out.println("cargoPlane contains goods");
  }
}

class passengerPlane3 extends Airplane3 {
  public void takeOff() {
    System.out.println("passengerPlane requires medium size runway");
  }

  public void fly() {
    System.out.println("passengerPlane is flying at medium height "); // This method is overriding method because it is
                                                                      // modified
    // accordingly.
  }

  public void carryPassenger() { // Such method which are not in their parent class and are only present in the
                                 // child class are called specialized method.
    System.out.println("passengerPlane contains passenger");
  }
}

class fighterPlane2 extends Airplane3 {
  public void fly() {
    System.out.println("fighterPlane is flying at high height "); // This method is overriding method because it is
                                                                  // modified accordingly.

  }

  public void takeOff() {
    System.out.println("fighterPlane require small size runWay");
  }

}

class Airport {
  public void poly(Airplane3 ref) {
    System.out.println("----------------inside-airport-poly-class -----------------");

    ref.takeOff(); // has the ability to invoke takeoff() method in all child class of airplane2
    ref.fly(); // has the ability to invoke fly() method in all child class of airplane2
  }
}

public class a_abstraction {
  public static void main(String[] args) {
    System.out.println("Abstraction example ");

    // parent class objects have the capability to hold the child class object

    /* creating objects of all three child class */
    Airplane3 ref1 = new cargoPlane3(); // have the type of parent class
    ref1.takeOff();
    ref1.fly();
    System.out.println("----------executing carry goods method");
    // ref1.carryGoods(); // it gives error because method is in child class not in
    // parent class for this we use doubt casting
    ((cargoPlane3) ref1).carryGoods(); // doubt casting || make ref1 of cargoPlane3 class temporary

    Airplane3 ref2 = new passengerPlane3(); // have the type of parent class
    ref2.takeOff();
    ref2.fly();

    // Airplane3 ref3 = new Airplane3(); // this gives error so we can not create
    // the object of abstract class || looks illogical to create a object of that
    // class which has no body to execute

  }
}
