package CourcePartII.Lesson75LockReentrantLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test105 {

        public static void main(String[] args) throws InterruptedException {
            Lock lock = new ReentrantLock();
            new Employee("I", lock);
            new Employee("Svetlana", lock);
            Thread.sleep(50000);
            new Employee("Max", lock);
            new Employee("Alex", lock);
            new Employee("Alina", lock);
    }

}




    class Employee extends Thread{
            String name;
            private Lock lock;

            public Employee(String name, Lock lock) {
                this.name = name;
                this.lock = lock;
                this.start();
            }

            //    public void run() {
            //            try {
            //            System.out.println(name + " Ждет ..");
            //            lock.lock();
            //            System.out.println(name + " Пользуется банкоматом ..");
            //            Thread.sleep(2000);
            //                System.out.println(name + " Не Пользуется банкоматом ..");
            //            } catch (InterruptedException e) {
            //                e.printStackTrace();
            //            }
            //            finally {
            //                lock.unlock();
            //            }
            //        }


            public void run() {

                if (lock.tryLock()) {
                    try {

                        System.out.println(name + " Пользуется банкоматом ..");
                        Thread.sleep(2000);
                        System.out.println(name + " Не Пользуется банкоматом ..");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        lock.unlock();
                    }
                } else {
                    System.out.println(name + " не стал ждать");
                }

            }


        }

