
public class G_StaticKeyword2 {

  static int a; // loaded at the time of class loading even before main method. || static has
                // its memory in heap directly

  static { // loaded at the time of class loading even before main method.
    System.out.println("Static Block");
    a = 10;
    System.out.println(a);
  }

  public static void main(String[] args) {
    System.out.println("Main Block");
  }
}

/*
 * ||Note: if you want to execute any set of code before Main() method then we
 * can write it in static block
 */

/** order of Static in java programme */
// 1.Static variable
// 2.Static block
// 3.Static method
// 4. non-static variable(instance).
// 5. non-static block.
// 6. non-static method.

/* Static and non-static Member of a class */
//