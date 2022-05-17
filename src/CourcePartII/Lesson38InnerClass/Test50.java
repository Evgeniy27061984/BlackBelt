package CourcePartII.Lesson38InnerClass;



public class Test50 {
    public static void main(String[] args) {
        Car car = new Car("white250", 4,500);
        System.out.println(car);//My car: {color='white250', doorCount=4, engine=My Engine: {horsePower=500}}


    }
}

class Car { // interface так же можно делать внутренним
    String color;
    int doorCount;
    Engine engine;


    public Car (String color, int doorCount,int horsePower) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = this.new Engine(horsePower);
    }

    @Override
    public String toString() {
        return "My car: {" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    public class Engine {
        int horsePower;


        public Engine(int horsePower) {
            this.horsePower = horsePower;

        }

        @Override
        public String toString() {
            return "My Engine: {" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}