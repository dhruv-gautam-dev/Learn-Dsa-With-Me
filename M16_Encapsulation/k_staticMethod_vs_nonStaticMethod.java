
class Method {

  static void staticMethod() {
    System.out.println("Static Method");
  }

  void normalMethod() {
    System.out.println("non-Static/Normal Method");
  }
}

public class k_staticMethod_vs_nonStaticMethod {
  public static void main(String[] args) {
    Method.staticMethod(); // does not get any error because method is static and don't need object to
                           // create memory

    // Method.normalMethod(); // it gives error because non-static or instance
    // method need object to create memory

    Method obj1 = new Method();
    obj1.normalMethod(); // now we are using object to call non-static/instance method then no error is
                         // coming.

    obj1.staticMethod(); // for static method we can call them by using class and object to , because
                         // they are in heap and can access by object easily.

  }
}
