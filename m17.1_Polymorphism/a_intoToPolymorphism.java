
class Airplane2 {
  public void takeOff() {
    System.out.println("Plane is ready to take off");
  }

  public void fly() { // this method is called overridden because it is inherit and modified in child
    // class accordingly.
    System.out.println("Aeroplane is flying now ");
  }
}

class cargoPlane2 extends Airplane2 {
  public void fly() {
    System.out.println("plane is flying at lower height "); // This method is overriding method because it is modified
                                                            // accordingly.
  }

  public void takeOff() {
    System.out.println("cargoPlane require longer runWay");
  }

  public void carryGoods() {
    System.out.println("cargoPlane contains goods");
  }
}

class passengerPlane2 extends Airplane2 {
  public void takeOff() {
    System.out.println("passengerPlane requires medium size runway");
  }

  public void fly() {
    System.out.println("plane is flying at medium height "); // This method is overriding method because it is modified
                                                             // accordingly.
  }

  public void carryPassenger() { // Such method which are not in their parent class and are only present in the
                                 // child class are called specialized method.
    System.out.println("passengerPlane contains passenger");
  }
}

class fighterPlane2 extends Airplane2 {
  public void fly() {
    System.out.println("fighterPlane is flying at high height "); // This method is overriding method because it is
                                                                  // modified accordingly.

  }

  public void takeOff() {
    System.out.println("fighterPlane require small size runWay");
  }

}

class Airport {
  public void poly(Airplane2 ref) {
    System.out.println("----------------inside-airport-poly-class -----------------");

    ref.takeOff(); // has the ability to invoke takeoff() method in all child class of airplane2
    ref.fly(); // has the ability to invoke fly() method in all child class of airplane2
  }
}

public class a_intoToPolymorphism {
  public static void main(String[] args) {
    System.out.println("polymorphism example ");

    // parent class objects have the capability to hold the child class object

    /* creating objects of all three child class */
    cargoPlane2 cp = new cargoPlane2();
    passengerPlane2 pp = new passengerPlane2();
    fighterPlane2 fp = new fighterPlane2();

    // we can not change the type of object to string ,int etc as well we can not
    // change the type of object to other class name , But we can change the type of
    // object to parent class type'

    Airplane2 cp2 = new cargoPlane2(); // it gives no error with his parent class type

    Airport a = new Airport();
    a.poly(cp); // has the reference of cargoPlane object then it invoke any method of
                // cargoPlane class
    a.poly(pp); // has the reference of passengerPlane object then it invoke any method of
                // passengerPlane class

    /* Below code is reduced by using polymorphism in above code */
    // cp.takeOff();
    // cp.fly();

    // pp.takeOff();
    // pp.fly();

    // fp.takeOff();
    // fp.fly();

  }
}

/**** what is Polymorphism */
// if one thing exists in more then one form then it is called Polymorphism.
// Poly means'many' and morphism means "structure or forms ".
// it has two types : 1.Static Polymorphism . Dynamic Polymorphism.

/**** How to achieve Polymorphism in java */
// 1.Static Polymorphism :if polymorphism exits at compilation then it is called
// Static polymorphism. Ex:- overloading.
// 2.Dynamic Polymorphism: if polymorphism exits at run time then it is called
// Static polymorphism. Ex:- overriding.

/**** Method overloading */
// 1.The Process of extending the existing method functionality with new
// functionality is called Method Overloading.
// 2.Different method signature must provided to the method

/**** Method Overriding */
// 1.The process of replacing existing method functionality with some new
// functionality is called Method overriding.
// 2. To perform method overriding, we must have inheritance relationship
// classes.
// 3. in java, we override super() class method with sub class method
// 4. if we want to override super class method with sub class method then both
// super class method and sub class method have same method prototype.

/*
 * Note:|| can see the example in d_types_of_method.java file , but the code is
 * not yet reduced there
 */