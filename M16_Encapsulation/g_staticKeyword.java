
public class g_staticKeyword {
  public static void main(String[] args) {
    System.out.println("code is running");
  }
}

/* Static Keyword */
// Static keyword is mainly used for memory management in java.
// Static keyword can be applied to variable, blocks, function and class
// it is property of class rather then instance of the class.
// Static keyword is used for a constant variable or a method that is the same
// for every instance of the class.

/* Where is the Static Keyword applicable */
// Static Keyword is not an access modifiers in java which is applicable for the
// following.
//
// 1.Variable
// 2.Methods
// 3.Block
// 4.Class

/* Class loading and (jvm) */
// Demo.java => java compiler => Demo.class(in Bites) => jvm => 0010101
// (execution)

// JRE(java runtime Environment )[
// jvm (java virtual machine ): all java codes executes here inside JRE.
// ]

/* How java actually executes */
// 1. .class file
// 2. class loader sub system
// 3.Runtime data areas{
// 1.Method area
// 2.Heap
// 3.Java Stack
// 4.PC registers
// 5.Native Method Stack
// }
// 4.Execution Engine{
// 1. Interpreter
// 2. JIT compiler
// }
// 5.Operating System.

/* Class Loading */
// ìn java, class loading is a process of loading class files in JVM at runtime.
// it is responsible for loading classes for from various sources such as file
// System, network and dataBase and making them available to JVM for execution.

// class loading is divided into three phases {
// 1.loading
// 2.linking
// 3.initialization
// }