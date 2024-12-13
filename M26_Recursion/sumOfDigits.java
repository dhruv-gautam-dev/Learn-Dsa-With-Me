public class sumOfDigits {
  public static int SumOFDigitscal(int num) {
    int result;
    // base case
    if (num == 0) {
      return 0;
    } else {
      result = (num % 10) + SumOFDigitscal(num / 10);
    }
    return result;
  }

  public static void main(String[] args) {
    int num = 1345;
    int result = SumOFDigitscal(num);
    System.out.println(result);
  }
}
