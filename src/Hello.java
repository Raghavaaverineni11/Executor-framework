
import java.util.concurrent.*;

public class Hello {

    public static void main(String[] args) throws Exception
    {

        ExecutorService e=Executors.newFixedThreadPool(3);

            Future<?> s = e.submit(() -> System.out.println(Thread.currentThread().getName()));
            System.out.println(s);



        System.out.println(Thread.currentThread().getName());
        e.shutdown();
        System.out.println(e.isShutdown());





    }

}
