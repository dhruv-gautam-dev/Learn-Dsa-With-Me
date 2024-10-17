public class twoDArray {

  public static void main(String[] args) {

    // initialization of an array if we know space to given not element
    int nums[][] = new int[3][6];

    nums[0][0] = 5; /* logic to put the value in nums[][] array */
    nums[0][1] = 25; /* logic to put the value in nums[][] array */
    nums[0][2] = 54; /* logic to put the value in nums[][] array */

    /*
     * what if we know the elements of 2D array at the declaration of array then we
     * can do ...
     */
    int nums1[][] = {
        { 5, 25, 6 },
        { 5, 6, 6 },
        { 8, 8, 8 }
    };

    /*
     * what if we have zagged arrays and we don't know the no of column in array ..
      */
    int nums2[][] = new int[3][]; /* Zagged array initialization */

    /*
     * putting the memory for zagged array by tracking column if we nt know th
     *  elements of subarray/column of an arra
      */
    nums2[0] = new int[4];
    nums2[1] = new int[5];
    nums2[2] = new int[6];

    /* a loop to print the elements of an array */
    for (int i = 0; i <= 2; i++) { /* tracking rows */
      for (int j = 0; j < nums2[i].length; j++) { /* tracking columns */
        System.out.print(nums2[i][j] + " "); /* logic to print nums[][] array */
      }
      System.out.println();
    }

  }
}
