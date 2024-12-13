public class findPower {
  // Recursive function
  public static int findPower(int a, int b) {
    // Base case
    int result;
    if (b == 1) {
      return b;
    } else {
      result = a * findPower(a, b - 1);

    }
    return result;
  }

  public static void main(String[] args) {
    // Driver code
    int a = 2;
    int b = 3;
    int result = findPower(a, b);
    System.out.println(result); // Recursive function call
  }
}

// this is BruteForce approach