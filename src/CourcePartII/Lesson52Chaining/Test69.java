package CourcePartII.Lesson52Chaining;

import java.util.Arrays;

public class Test69 {
    public static void main(String[] args) {
        int [] array = {5,9,25,5,98};
        //оставим нечетные
        //оставим что делится на 3
        //сумма оставших чисел
        int result = Arrays.stream(array).filter(e -> e%2==1)
                .map(e -> {
                if(e%3==0) {
                e=e/3;} return e;}).reduce((a,e) -> a+e).getAsInt();
        System.out.println(result);
        //5,9,25,5
        //5,9/3,25,5
        //5+3+25+5
        //38
    }
}
