
// final class Animal3 { // with final keyword we can not inherit Animal3 class
//   void sleep() {
//     System.out.println("Animal is sleeping");
//   }
// }

class Animal3 { // with final keyword we can not inherit Animal3 class
  final int age = 19; // can not change the value with final keyword

  final void sleep() {// with final keyword we can inherit Method in child class but no one is able to
                      // override this method in child class
    // age = 20;// can not change the value with final keyword

    System.out.println("Animal is sleeping");
  }
}

class Tiger3 extends Animal3 {
  // void sleep() { // not possible to override method with final keyword form
  // parent class.
  // System.out.println("trying to override method of parent class with final
  // keyword ");
  // }
}

public class b_finalKeyword {
  public static void main(String[] args) {
    Tiger3 t1 = new Tiger3();
    t1.sleep();
  }
}

/**** Final Keyword */
// 1.Final keyword can be written with class, Method, variable
// 2.if class is marked as final it can not take part in inheritance , if we try
// to do it results in compile time error
// 3.if method is declared as final then those method we cant override, if we
// try to do so it results in compile time error.