import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int customer_no = 5;
        Customers[] customers = new Customers[customer_no];
        Random random = new Random();

        Queue<Customers> customerQueue = new LinkedList<>();

        for(int i=0; i<customer_no; i++) {
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

        int running_time = 0;
        while (!customerQueue.isEmpty()) {
            Customers currentCustomer = customerQueue.peek();
            if(running_time>=currentCustomer.incoming_time){
                customerQueue.remove();
                if(running_time < currentCustomer.incoming_time + currentCustomer.max_waiting_time) {
                    System.out.println("Processing " + currentCustomer.customerID + " with incoming time: " + currentCustomer.incoming_time);
                    System.out.println("Service started at " + running_time);
                    currentCustomer.outgoing_time = running_time + currentCustomer.service_time;
                    currentCustomer.service_taken = true;
                    running_time += currentCustomer.service_time;
                    continue;
                }
                else {
                    System.out.println("Customer " + currentCustomer.customerID + " leaved the bank without taking service");
                    System.out.println("Running time " + running_time);
                    System.out.println("Incoming time " + currentCustomer.incoming_time);
                    System.out.println("Waiting time " + currentCustomer.max_waiting_time);
                    currentCustomer.service_taken = false;
                }
                
            }
            running_time++;
        }
    }
}
