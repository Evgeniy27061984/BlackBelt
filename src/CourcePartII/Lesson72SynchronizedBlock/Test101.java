package CourcePartII.Lesson72SynchronizedBlock;

public class Test101 {
    //3 разных монитора надо чтоб по одному объекту
    static final Car car = new Car();
    static final Object lock = new Object(); // лучше не выдумывать класс
    
    void mobileCall() {
        synchronized (car) {
            System.out.println(this);
            System.out.println("Mobile call starts");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Mobile call ends");
        }
    }
    void skypeCall() {
        synchronized (car) {
            System.out.println(this);
            System.out.println("Skype call starts");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Skype call ends");
        }
    }
    void whatsappCall() {
        synchronized (car) {
            System.out.println(this);
            System.out.println("Whatsapp call starts");
            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Whatsapp call ends");
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunnableImpMobile());
        Thread thread2 = new Thread(new RunnableImpSkype());
        Thread thread3 = new Thread(new RunnableImpWhatsapp());
        thread1.start();
        thread2.start();
        thread3.start();

    }

}

class RunnableImpMobile implements Runnable{

    @Override
    public void run() {
        new Test101().mobileCall();
    }
}
class RunnableImpSkype implements Runnable{

    @Override
    public void run() {
        new Test101().skypeCall();
    }
}

class RunnableImpWhatsapp implements Runnable{

    @Override
    public void run() {
        new Test101().whatsappCall();
    }
}

class Car {

}