package CourcePartII.Lesson8Subtyping;

import java.util.ArrayList;
import java.util.List;

public class Test9 {
    public static void main(String[] args) {
        X x = new Y();
        // List<X> list = new ArrayList<Y>(); don't work Не является подтипом ArrayList<Y>
        // ArrayList<> является  подтипом List<>
        // ArrayList<Y> является  подтипом List<X>
        //Например
//        List<Number> list = new ArrayList<Integer>();
//        list.add(18);
//        list.add(3.14); //здесь не понятно в Number подходит но Integer нет

    }
}

class X {

}

class Y extends X {

}

