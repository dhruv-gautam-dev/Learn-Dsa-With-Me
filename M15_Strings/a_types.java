public class a_types {
  public static void main(String args[]) {
    String brand = "pwskills"; /* creating a string using ${String} */
    System.out.println(brand);
    brand.concat("agra"); /* adding two string */
    System.out.println(brand); /* output is { pwskills} hence this shows that strings are immutable */

    StringBuilder brand1 = new StringBuilder("pwskills"); /* creating a string using ${StringBuilder} */
    System.out.println(brand1);
    brand1.append("agra"); /* adding two string */
    System.out.println(brand1); /* output is $(pwskillsagra) shows it behaes as mutable */
  }
}
