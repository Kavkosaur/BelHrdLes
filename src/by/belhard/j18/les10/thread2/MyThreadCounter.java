package by.belhard.j18.les10.thread2;

public class MyThreadCounter implements Runnable {
    private final Counter counter;

    public MyThreadCounter(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {

        for(int i = 0 ; i < 1000000 ; i++){
            synchronized (counter) {
                counter.inc();
            }
        }
        System.out.println("FIN");
    }
}
