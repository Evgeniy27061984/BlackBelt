package CourcePartII.Lesson37StaticNested;

public class Test49 {
    public static void main(String[] args) {
        Car.Engine engine = new Car.Engine(250);
        //Engine можно создать без создания класса Car
        System.out.println(engine); //My Engine: {horsePower=250}
        Car car = new Car ("red",2,engine);
        System.out.println(car);//My car: {color='red', doorCount=2, engine=My Engine: {horsePower=250}}
        //Car.Engine engine2 = new car.Engine(250); нельзя

    }
}

class Car { // interface так же можно делать внутренним
    String color;
    int doorCount;
    Engine engine;
    private static int a;

    public Car (String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }
    void method () {
        System.out.println(Engine.countObject);
        Engine e = new Engine(200);
        System.out.println(e.horsePower);

    }

    @Override
    public String toString() {
        return "My car: {" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    public static class Engine {
        //private не увидим класс Engine
        //final нельзя наследоватьэ
        //abstract нельзя создать объект
        int horsePower;
        static int countObject;

        public Engine(int horsePower) {
            System.out.println(a);
            //System.out.println(doorCount); напрямую нельзя не статик
            this.horsePower = horsePower;
            countObject++;
        }

        @Override
        public String toString() {
            return "My Engine: {" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}
class Z extends Car.Engine {
    Z() {
        super(200);
    }
}



