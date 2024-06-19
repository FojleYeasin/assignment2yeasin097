import java.util.Queue;

public class Server {
    

    private Queue<Customers> customerQueue;
    
    public Server(Queue<Customers> customerQueue) {
        this.customerQueue = customerQueue;


    }



    public void Serve() {
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
