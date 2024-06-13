import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Customers[] customers = new Customers[30];
        Random random = new Random();

        Queue<Customers> customerQueue = new LinkedList<>();

        for(int i=0; i<30; i++) {
            int random_int = random.nextInt(100);
            //System.out.println(random_int);
            customers[i] = new Customers(random_int);
        }

        Arrays.sort(customers, Comparator.comparingInt(c -> c.incoming_time));

        for (int i = 0; i < customers.length; i++) {
            customers[i].customerID = "customer" + (i + 1);
            // System.out.println("Customer ID: " + customers[i].customerID + ", Incoming Time: " + customers[i].incoming_time);
            customerQueue.offer(customers[i]);
        
        }

        
        while (!customerQueue.isEmpty()) {
            Customers currentCustomer = customerQueue.poll();
            System.out.println("Processing " + currentCustomer.customerID + " with incoming time: " + currentCustomer.incoming_time);
        }
    }
}
