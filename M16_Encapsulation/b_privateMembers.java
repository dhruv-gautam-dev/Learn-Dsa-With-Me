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

/* Shadowing Problem and this Keyword */
// if both local variable and instance variable are have the same name inside
// the method then it will result in name-clash. and jvm will always give
// preference to local variable. This approach is called "Shadowing Problem "

/* Example: */

// public void setData(age) {
// value of private variable
// age = age; // value of age is assigned in age itself is an example of
// shadowing problem
// }

// as a solution we can tell by using the variable that age is not a local
// variable it is instance variable.
// for this there is 'this' keyword which is referring to current object through
// which it is called .

// public void setData(age) { // use this public Method from outside to set the
// value of private variable
// this.age = age; // shadowing problem is solved by using this keyword which
// tells the age is instance variable of this object.
// }