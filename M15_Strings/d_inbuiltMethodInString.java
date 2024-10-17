public class d_inbuiltMethodInString {
  public static void main(String[] args) {
    String str = "Hello, World!";
    System.out.println(str);

    System.out.println("----------------------toUpperCase() Method------------------>>");
    System.out.println(str.toUpperCase());

    System.out.println("----------------------toLowerCase() Method------------------>>");
    System.out.println(str.toLowerCase());

    System.out.println("----------------------Method to calculate length------------------>>");
    System.out.println(str.length());

    System.out.println("----------------------Method to find character at perticular index------------------>>");
    System.out.println(str.charAt(1));

    System.out.println("----------------------Method to extract the substring from a string ------------------>>");
    System.out.println(str.substring(7, 13));

    System.out
        .println("---------------------Method to calculate the index of perticular character------------------>>");
    System.out.println(str.indexOf("o"));

  }
}
