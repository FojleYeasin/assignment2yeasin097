// This is a simple Java program
public class Main {

    // The main method is the entry point of the program
    public static void main(String[] args) {
        Server server1 = new Server(0);
        Server server2 = new Server(100);

        Thread thread1 = new Thread(server1);
        Thread thread2 = new Thread(server2);

        thread1.start();
        thread2.start();


    }
}
