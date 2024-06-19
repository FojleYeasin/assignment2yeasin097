import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        long startTime = System.nanoTime();

        int customer_no = 50;

        QueueOfBank bankQueue = new QueueOfBank(customer_no);
        Queue<Customers> customerQueue = bankQueue.getCustomerQueue();


        Server server1 = new Server(customerQueue,1);

        Server server2 = new Server(customerQueue,2);

        Thread thread1 = new Thread(server1);
        Thread thread2 = new Thread(server2);

        thread1.start();
        thread2.start();

        long endTime = System.nanoTime();

        System.out.println("This code is run by "+ (endTime - startTime)/1000000 + "ms");
    }
}
