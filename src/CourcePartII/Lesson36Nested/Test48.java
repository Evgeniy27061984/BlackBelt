package CourcePartII.Lesson36Nested;

public class Test48 { // ВНЕШНИЙ класс (top level)
  static class A{} // статик класс
    class B{} //inner class
     void method() {
            class C{} // local class
     }

}

//и есть аннонимные классы в lesson40
// как правило nested class к переменным даже приват