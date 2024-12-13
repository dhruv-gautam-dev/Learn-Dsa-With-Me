import java.util.Scanner;

public class findPower2 {
  // Recursive function
  findPower2(int a, int b) {
    int mid = 0, result = 0, finalResult = 0;
    // Base case
    if (b == 1) {
      return a;
    } else {

    }
  }

  public static void main(String[] args) {
    // Driver code
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int result = findPower2(a, b);
    System.out.println(result); // Recursive function call
  }
}