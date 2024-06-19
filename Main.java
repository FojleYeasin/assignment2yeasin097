import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        long startTime = System.nanoTime();

        int customer_no = 50;

        QueueOfBank bankQueue = new QueueOfBank(customer_no);
        Queue<Customers> customerQueue = bankQueue.getCustomerQueue();


        Server server = new Server(customerQueue);
        server.Serve();

        long endTime = System.nanoTime();

        System.out.println("This code is run by "+ (endTime - startTime)/1000000 + "ms");
    }
}
