import java.util.Scanner;

public class fact {

  public static int findFact(int n) {
    int result = 0;
    // 1.basecase condition
    if (n == 0 || n == 1) {
      return 1;
    } else {
      result = findFact(n);
    }
    return result;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number to find factorial");
    int n = sc.nextInt();

    int result = findFact(n);
    System.out.println(result);
    // System.out.print("factorial of given number is :", result);
  }
}
