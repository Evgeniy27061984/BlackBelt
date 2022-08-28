package CourcePartII.Lesson82Semaphore;

import java.util.concurrent.Semaphore;

public class Test119 {
    public static void main(String[] args) {
        Semaphore callBox = new Semaphore(2);
        new Person("I ", callBox);
        new Person("Svetlana ", callBox);
        new Person("Max ", callBox);
        new Person("Alina ", callBox);
        new Person("Alex ", callBox);

    }
}

class Person extends Thread {
    String name;
    private Semaphore callBox;

    public Person(String name, Semaphore callBox) {
        this.name = name;
        this.callBox = callBox;
        this.start();
    }
    @Override
    public void run() {

        try {
            System.out.println(name + " ждет...");
            callBox.acquire();
            System.out.println(name + "пользуется телефоном");
            sleep(2000);
            System.out.println(name + "завершил звонок");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            callBox.release();
        }
    }
}