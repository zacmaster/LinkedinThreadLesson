package threads;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Cantidad de threads: " + Thread.activeCount()); //Muestra 1
        ThreadExample t1 = new ThreadExample();
        t1.setName("Thread 1");
        t1.start();

        ThreadExample t2 = new ThreadExample();
        t2.setName("Thread 2");
        t2.start();
//        System.out.println(Thread.activeCount()); //Muestra 2
    }
}
