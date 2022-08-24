package CourcePartII.Lesson81CallableFuture2Part;

import java.util.concurrent.*;

public class Test117 {

    static int factorialResult;

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Factorial factorial = new Factorial(5);
        //executorService.execute(factorial);

        Future future = executorService.submit(factorial);
        executorService.shutdown();
        executorService.awaitTermination(10, TimeUnit.SECONDS);
        System.out.println(future.get());//null
        System.out.println(future.isDone());//true
        System.out.println(factorialResult);

    }

}

class Factorial implements Runnable{
    int f;

    public Factorial(int f) {
        this.f = f;
    }

    @Override
    public void run() {
        if (f<=0) {
            System.out.println("wrong number");
            return;
        }

        int result = 1;
        for (int i = 1; i <= f; i++) {
            result*=i;
        }
        Test117.factorialResult = result;

    }
}

