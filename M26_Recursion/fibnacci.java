import java.util.Scanner;

public class fibnacci {

  public static int fibnaccical(int n) {
    int result;
    if (n < 1) { // Base case condition
      return n;
    } else {
      result = fibnaccical(n - 1) + fibnaccical(n - 2); // function call
    }
    return result;
  }

  public static void main(String[] args) {
    int arr[];
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of n");
    n = sc.nextInt();
    int result = fibnaccical(n);
    System.out.println(result);
  }
}
