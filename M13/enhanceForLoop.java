
public class enhanceForLoop {
  public static void main(String[] args) {
    int[] nums = { 4, 5, 6, 5, 5, 45 };

    for (int i : nums) { /* using for-Each loop for one dimensional array */
      System.out.println(i);
    }

    int[][] nums1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 5, 6, 7 } }; /* two dimensional array */

    for (int a[] : nums1) { /* use a[] as variable because an array contains an array at index 0 */
      for (int j : a) {
        System.out.print(j + " ");
      }
      System.out.println();
    }

  }

}
/*
 * basically this loop is used to optimize the error ` index out of bound `
 */