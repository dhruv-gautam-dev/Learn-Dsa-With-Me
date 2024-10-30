
class Alpha {
  static int a;
  static int b;

  int c;
  int d;

  static { // static block to initialize static variable || have memory in heap directly
    System.out.println("Static Block");
    a = 10;
    b = 20;
  }

  {
    System.out.println("non-Static Block"); // non-static block to initialize non-static variable || memory inside
                                            // objects in heap .
    c = 30;
    d = 40;
  }
}

public class j_staticVariable_vs_instanceVariable {
  public static void main(String[] args) {
    Alpha obj1 = new Alpha();
    Alpha obj2 = new Alpha();
  }
}

/* Static variable */
// Static variable memory allocated only once at the time of loading class

/* Non-Static variable */
// non-Static variable memory allocated at every time a object created.