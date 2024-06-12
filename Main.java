// This is a simple Java program
public class Main {

    // The main method is the entry point of the program
    public static void main(String[] args) {

        Thread[] thread = new Thread[100];
        for(int i=0; i<100; i++) {
            thread[i] = new Thread(new Server(i));
            thread[i].start();
        }
        


    }
}
