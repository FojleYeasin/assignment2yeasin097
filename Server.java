public class Server implements Runnable{
    private int counter;

    public Server(int counter) {
        this.counter = counter;
    }


    public void addCounter() {
        counter++;
    }

    public void printCounter() {
        System.out.println(counter);
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            addCounter();
            printCounter();
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
