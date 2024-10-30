
class customer {
  private String Name;
  private int age;

  public void setName(String name) { // set method for Name
    this.Name = name;
  }

  public String getName() { // get method for Name
    return Name;
  }

  public void setAge(int age) { // set method for age
    this.age = age;
  }

  public int getAge() { // get method for age
    return age;
  }

  public void showDetails() {
    System.out.println("Name:" + Name);
    System.out.println("Age:" + age);
  }
}

public class c_gettersAndSetters {

  public static void main(String[] args) {
    customer cust1 = new customer();
    cust1.setName("Rahul"); // setter

    cust1.getName();// getter
    cust1.getAge();// getter

  }
}

/* Setters */
// setters variable are used to set the value to a instance variable of the
// class

/* Syntax of setters method */
// compulsory the method Name should start with set.
// it should be public.
// return type should be void.
// Compulsory it should have some arguments.

/* getters */
// getters variable are used to get the value to a instance variable of the
// class

/* Syntax of getters method */
// compulsory the method Name should start with get.
// it should be public.
// return type should be data type of value/variable.
// Compulsory it should not have some arguments.