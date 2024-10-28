package M16_Encapsulation;

class studentPrivate {
  private int privateStudentAge;
  private String privateStudentName;

  public void setData() { // use this public Method from outside to set the value of private variable
    privateStudentName = "Madhu";
    privateStudentAge = 20;
  }

  public void showValue() {
    System.out.println("Name:" + privateStudentName);
    System.out.println("age:" + privateStudentAge);
  }
}

public class b_privateMembers {
  public static void main(String[] args) {
    studentPrivate std2 = new studentPrivate();
    studentPrivate std3 = new studentPrivate();
    std3.showValue();

    std2.setData(); // used to set the value of private variable.
    std2.showValue();
  }

}
/* Private Members */
// our private data should not to outside world directly which means outside
// people can not access data directly.
// By using private modifiers we can implement data hiding.
