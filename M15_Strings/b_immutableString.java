class b_immutableString {
  public static void main(String args[]) {
    String s1 = "pw"; /* Memory space is in the string constant pool (SCP) */
    String s2 = "pw"; /* Memory space is in the string constant pool (SCP) */

    /*
     * as SCP does not allow a duplicate copy in its memory space so s1 and s2
     * refers to a same string
     */
    /* we can use == to check the reference of string */

    System.out.println(s1 == s2); /* we get true because both refers to a same string in SCP */

    String s3 = new String("PwSkill");
    String s4 = new String("PwSkill");

    /*
     * when we create Strings by using a new keyword then they get located and
     * referred in the heap memory space of the JVM
     * so s3 and s4 refers to different strings in heap memory space
     */

    System.out.println(s3 == s4); /* we get false because both refers to a same string in SCP */
  }
}
