// This is a simple Java program
public class Main {

    // The main method is the entry point of the program
    public static void main(String[] args) {

        // Thread[] thread = new Thread[100];
        // for(int i=0; i<100; i++) {

        // }
        Server server1 = new Server("1");
        Server server2 = new Server("2");

        Thread thread1 = new Thread(server1);
        Thread thread2 = new Thread(server2);

        thread1.start();
        thread2.start();


    }
}
