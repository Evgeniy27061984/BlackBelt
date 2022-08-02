package CourcePartII.Lesson73WaitNotify;

public class Test102 {
    public static void main(String[] args) {

        //wait освобождает монитор
        //notify не освобождает монитор
        //wait(1000) через 1 сек станет активным если только рвньше  notify не сработает

        Market market = new Market();//monitor
        Producer producer = new Producer(market);
        Consumer consumer = new Consumer(market);
        Thread thread1 = new Thread(producer);
        Thread thread2 = new Thread(consumer);
        thread1.start();
        thread2.start();

    }

}

class Market {
    private int breadCount = 0;

    public synchronized void getBread() { //если монитор другой объект то блок synchronized(другой){}
        while (breadCount < 1) { //if нельзя потому что поток может проснуться не ожиданно
            //if один раз проверяет
            try {
                wait();//если монитор другой объект другой.notify
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        breadCount--;
        System.out.println("Потребитель купил 1 хлеб");
        System.out.println("кол-во хлеба = " + breadCount );
        notify();//если монитор другой объект другой.notify

    }

    public synchronized void putBread() {
        while (breadCount >= 5) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        breadCount++;
        System.out.println("Производитель добавил 1 хлеб");
        System.out.println("кол-во хлеба = " + breadCount );
        notify();

    }
}

class Producer implements Runnable{
    Market market;

    public Producer(Market market) {
        this.market = market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            market.putBread();
        }
    }
}

class Consumer implements Runnable {
    Market market;

    public Consumer(Market market) {
        this.market = market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            market.getBread();
        }
    }
}