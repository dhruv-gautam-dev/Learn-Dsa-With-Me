package M16_Encapsulation;

class college {
  private String collegeName;
  private int collegeCode;

  /* constructor */
  college(String name, int code) { // constructors have same name that of class Name || no return type is provided
    // || used to initialize variables at the time of object creation
    this.collegeName = name;
    this.collegeCode = code;
  }

  /*
   * we use getters to get and setters to set the value of variable || what if we
   * want to set value at the time of object creation ??,,, we use constructors
   */
  // public String getCollegeName() { // getter for collegeName
  // return collegeName;
  // }

  // public void setCollegeName(String collegeName) { // setter for collegeName
  // this.collegeName = collegeName;
  // }

  // public int getCollegeCode() {// getter for collegeCode.
  // return collegeCode;
  // }

  // public void setCollegeCode(int collegeCode) {// setter for collegeCode
  // this.collegeCode = collegeCode;
  // }

}

public class d_constructers {
  public static void main(String[] args) {
    college clg1 = new college("HCST", 063); // constructor of college class is called || pass argument to set the value

    // clg1.setCollegeName("HCST"); // use this when we use setter
    // clg1.getCollegeName();
  }
}

/* Constructor */
// object creation is not enough, compulsory but we should perform
// initialization then only an object is in position to response properly.
// whenever we are creating object some piece of code is executing automatically
// to perform initialization of an object. that piece of code is nothing but a
// 'constructor'.
// Main objective of constructor is nothing but initialization of object.

// if we want to initialize out variable or data Members of class at the time of
// object creation then the constructor concept comes into picture for that we
// don't need any setter function.

// constructor name is same as the class Name and has not any return type (may
// be we can use access specifier that is optional )
