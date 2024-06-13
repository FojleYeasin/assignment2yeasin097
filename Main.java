public class Main {

    public static void main(String[] args) {
        long startTime = System.nanoTime();

        Server server = new Server(50);
        server.Serve();

        long endTime = System.nanoTime();

        System.out.println((endTime - startTime)/1000000);
    }
}
