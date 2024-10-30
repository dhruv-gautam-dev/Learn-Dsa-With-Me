// package M16_Encapsulation;

class Student { // class student is private class we can not access it from outside
  int age;
  String Name;
  private int Privateage; // we can not access this variable from outside this class because this is a
                          // private variable.
  private String PrivateName;

  public void Show() { // Method of Student class
    System.out.println("Name:" + Name);
    System.out.println("age:" + age);

  }

}

public class a_need_of_Encapsulation { // this is public class we can access it from outside
  public static void main(String[] args) {

    Student std1obj = new Student(); // created of object of Student(Private class)
    std1obj.age = 20; // set the value of object age variable of private class publicly.
    std1obj.Name = "Madhuri";
    std1obj.Show(); // call the method of Private class in public class.

    // System.out.println(std1obj.PrivateName); // if i am trying to access
    // privateName(private variable ) of class Student it shows me error.
  }

}

/* Need of Encapsulation */
// in real world data can not be exposed directly
// in order to provide the controlled access we need to use Encapsulation

/* What is Encapsulation */
// Binding of Data and corresponding Methods into a single unit is called
// Encapsulation
// If any Java class follows Data hiding and Abstraction then Such class is
// referred as "Encapsulated Class".
// Encapsulation = Data Hiding + Data Abstraction
// Data Hiding: Data is not visual in public.
// Data Abstraction: Operation performed in Data are also not visible to public.