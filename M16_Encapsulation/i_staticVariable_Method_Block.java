import java.util.*;

class farmer {
  int principalAmount = 0;
  float timeDuration;
  float simpleInterest;
  static float rateOfInterest; // we use static on those variable whose value is constant for all the objects
                               // so that it becomes better approach

  static {
    rateOfInterest = 4.5f;
  }

  void input(Scanner sc) {
    // Scanner sc = new Scanner(System.in);
    System.out.println("Enter the amount required ");
    principalAmount = sc.nextInt();
    System.out.println("Enter the time duration ");
    timeDuration = sc.nextFloat();

    sc.close();
  }

  void calculateSimpleInterest() {
    simpleInterest = (principalAmount * timeDuration * rateOfInterest) / 100f;
  }

  void display() {
    System.out.println("simple interest is :" + simpleInterest);
  }
}

public class i_staticVariable_Method_Block {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    farmer f1 = new farmer();
    farmer f2 = new farmer();

    f1.input(sc); // taking input from user
    f1.calculateSimpleInterest(); // calculate si
    f1.display(); // display si.

    f2.input(sc); // taking input from user
    f2.calculateSimpleInterest(); // calculate si
    f2.display(); // display si.
  }
}
