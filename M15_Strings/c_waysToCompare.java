public class c_waysToCompare {
  public static void main(String[] args) {
    /* Strings act as object in java and have memory Space in heap */
    String s1 = "pwSkill";
    String s2 = new String("pwSkill");

    /* == is used to compare the reference of the string */
    /* .equals() is used to compare the content of the string */

    System.out.println(s1 == s2); /* false `due to one have memory in heap and one have in SCP` */
    System.out.println(s1.equals(s2)); /* true `content of both string is same ` */
  }
}
