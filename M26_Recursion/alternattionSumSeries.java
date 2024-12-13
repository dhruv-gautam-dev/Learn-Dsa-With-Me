import java.util.Scanner;

public class alternattionSumSeries {
  public static int alternateFindSum(int n) {
    // base case condition
    if (n == 0) {
      return 0;
    }

    if (n % 2 == 0) {
      return alternateFindSum((n - 1) - n);
    } else {
      return alternateFindSum((n - 1) + n);
    }
  }

  public static void main(String[] args) {
    // Driver code
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the numbers of which you want sum ");
    int n = sc.nextInt();
    int result = alternateFindSum(n);
    System.out.println("The alternate series sum is :" + result);

  }
}