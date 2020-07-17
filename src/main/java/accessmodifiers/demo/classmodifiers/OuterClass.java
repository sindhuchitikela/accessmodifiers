package accessmodifiers.demo.classmodifiers;

public class OuterClass {
  int x = 10; //No access modifier on this variable, this means package protected

  class InnerClass { // this could be either private or package protected.
    int y = 5;
  }
}

