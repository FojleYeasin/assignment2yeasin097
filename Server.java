public class Server {
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
}
