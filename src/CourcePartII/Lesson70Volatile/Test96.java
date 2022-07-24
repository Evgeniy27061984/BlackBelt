package CourcePartII.Lesson70Volatile;

public class Test96 extends Thread{
    volatile boolean b = true;
    @Override
    public void run() {
        long counter = 0;
        while (b) {
            counter++;
        }
        System.out.println(counter);
    }

    public static void main(String[] args) throws InterruptedException {
        Test96 thread = new Test96();
        thread.start();
        Thread.sleep(3000); //sleep on main
        thread.b = false; //без volatile будет работать долго
        //потому что по умолчанию значение b  лежит в кэш
        thread.join();

        //volatile используется когда один поток меняет другой читает
        // если два потока будут менять а++ то один уже их сложил
        // а второй тоже сложил и результат другой получится не правильный


    }
}
