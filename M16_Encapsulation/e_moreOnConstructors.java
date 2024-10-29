package M16_Encapsulation;

class myClass {
  private int privateVarA;
  private int privateVarB;

  // public myClass(){ // default constructor added by java

  // }

  void display() { // public method to display private variable value
    System.out.println(privateVarA);
    System.out.println(privateVarB);
  }

}

public class e_moreOnConstructors {
  public static void main(String[] args) {
    myClass obj1 = new myClass(); // this is constructor call but error is not coming ????
                                  // coz if we does not include constructor then there is default constructor
                                  // which included by java behind the scenes. and
                                  // error is not coming because default constructors have no arguments in it .
    obj1.display();
  }
}
