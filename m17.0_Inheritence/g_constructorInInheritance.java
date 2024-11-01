
class Demoo1 {
  int a, b;

  public Demoo1() {
    System.out.println("parent class constructor");

  }

  public Demoo1(int x, int y) {
    System.out.println("Parameterized parent class constructor");
    a = x;
    b = y;
  }
}

class Demoo2 extends Demoo1 {
  int m, n;

  public Demoo2() {
    // super();
    System.out.println("child  class constructor");

  }

  public Demoo2(int x, int y) {
    // super() behind the scene || control goes to Demoo1 class 0 parameterized
    // constructor
    // if super(x,y) have parameter then control Demoo1 class parameterized
    // constructor

    /* what if there is this() not super() */
    // then this will call the constructor of same class not parent class.
    System.out.println("Parameterized child class constructor");
    m = x;
    n = y;
  }
}

public class g_constructorInInheritance {
  public static void main(String[] args) {
    Demoo2 d = new Demoo2(); // constructor call for child class constructor

    Demoo2 d2 = new Demoo2(10, 20);

  }
}
