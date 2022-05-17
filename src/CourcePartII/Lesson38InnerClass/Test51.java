package CourcePartII.Lesson38InnerClass;



public class Test51 {
    public static void main(String[] args) {
        Car2 car = new Car2("VW", 4);
        System.out.println(car);//My car: {color='VW', doorCount=4, engine=null}
        Car2.Engine engine = car.new Engine(500);
        Car2.Engine engine2 = new Car2 ("yellow",4).new Engine(700);
        //не понятно какой машине принадлежит мотор
        System.out.println(car);//My car: {color='VW', doorCount=4, engine=null}
        System.out.println(engine);//My Engine: {horsePower=500}
    }

}

class Car2 { // interface так же можно делать внутренним
    //может обращаться к приват переменным внутреннего класса
    String color;
    int doorCount;
    Engine engine;


    public Car2 (String color, int doorCount) {
        //System.out.println(horsePower); нельзя сначало нужно создать Engine
        Engine engine = new Engine(200); //можно не указывать полный путь Car.Engine
        this.color = color;
        this.doorCount = doorCount;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "My car: {" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    public class Engine {//может обращаться к приват переменным внешнего класса
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