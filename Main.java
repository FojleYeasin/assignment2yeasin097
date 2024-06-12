// This is a simple Java program
public class Main {

    // The main method is the entry point of the program
    public static void main(String[] args) {
        Server server = new Server(0);
        for(int i=0; i<10; i++) {
            server.addCounter();
        }
        server.printCounter();

    }
}
