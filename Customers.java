public class Customers {
    public int incoming_time;
    public int outgoing_time;
    public int service_time;
    public int max_waiting_time;
    public String customerID;
    public boolean service_taken = false;

    public Customers(int incoming_time) {
        this.incoming_time = incoming_time;
    }
    
    public int get_waiting() {
        if(service_taken) {
            return (outgoing_time - incoming_time - service_time);
        }
        else {
            return  -1;
        }
    }
}
