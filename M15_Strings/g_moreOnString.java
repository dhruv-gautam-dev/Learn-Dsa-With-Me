public class g_moreOnString {
  public static void main(String[] args) {
    StringBuffer sb = new StringBuffer();
    System.out.println(sb.capacity()); // have a capacity of 16 characters || how many characters you can keep
    System.out.println(sb.length()); // how many characters are there in sb

    StringBuilder sbb = new StringBuilder();
    System.out.println(sbb.capacity()); // have a capacity of 16 characters`
    sbb.append("qqqqqqqqqqqqqqqqqqqqqqqqqq");// if the characters are more then 16.
    System.out.println(sbb.capacity()); // have a capacity of 34( (16+1) *2) characters in stringBuilder.
    StringBuffer sb2 = new StringBuffer("qwerty");
    System.out.println(sb2);
    sb2.charAt(1);
    sb2.setCharAt(0, 'a');
    System.out.println(sb2); // replace character with index

    StringBuffer a = new StringBuffer(150); // set the capacity to 150
    a.append("java");
    System.out.println(a);
    a.trimToSize(); // trim the capacity from 150 to 4 which is needed

  }

}
