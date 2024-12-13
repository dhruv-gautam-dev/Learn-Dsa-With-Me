public class binarySearch {

  public static int binarySearch(int arr[], int low, int high, int x) {
    int result = -1;
    while (low <= high) {
      int mid = low + (high - low) / 2;
      if (arr[mid] == x) {
        return mid;
      } else if (arr[mid] < x) {
        // traverse to right side of an array
        return binarySearch(arr, mid + 1, high, x);
      } else {
        // traverse to left side of an array
        return binarySearch(arr, low, mid - 1, x);
      }
    }
    return result;
  }

  public static void main(String[] args) {
    // Driver code
    int arr[] = { 2, 4, 8, 12, 23, 34, 45, 56, 67, 78 };
    int low = 0;
    int high = arr.length - 1;
    int x = 12;
    int result = binarySearch(arr, low, high, x);
    System.out.println(result);
  }
}
