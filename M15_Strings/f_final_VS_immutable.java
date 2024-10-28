public class f_final_VS_immutable {
  public static void main(String[] args) {
    int a = 10;
    a = 20; // value is getting updated with int keyword
    System.out.println(a);

    final int b = 10;
    // b = 30; // does not update the value and gives error.
    System.out.println(b);

    StringBuffer sb = new StringBuffer("virat");
    sb.append("kolhi");
    System.out.println(sb);// OUTPUT: | viratKolhi

    sb = new StringBuffer("Sachin");
    System.out.println(sb); // OUTPUT: | Sachin || reference to sb variable change

    final StringBuffer sb1 = new StringBuffer("virat");
    sb1.append("kolhi");
    System.out.println(sb1);// OUTPUT: | viratkohli

    // sb1 = new StringBuffer("Sachin");// GIVES ERROR | FINAL VARIABLE IS THERE WE
    // CAN NOT CHANGE THE VALUE OF SB1,, WE CAN APPEND TO IT
    System.out.println(sb1); // OUTPUT: | viratkolhi || reference to sb variable not change

    // final keyword have not any impact on mutability, it has only impact of
    // variable valuel.

  }

}
