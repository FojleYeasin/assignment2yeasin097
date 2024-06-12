public class Server implements Runnable{
    private static int counter = 0;
    private int threadID;

    public Server(int threadID) {
        this.threadID = threadID;
    }


    public void addCounter() {
        counter++;
    }

    public void printCounter() {
        System.out.println(threadID + " thread count: " + counter);
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            addCounter();
            printCounter();
            try {
                Thread.sleep(10);
            }
            catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
