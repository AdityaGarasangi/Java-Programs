//Program to buy, cancel and to view available tickets
class TicketCounter {
    int num_tickets;
    int ticket_counter;

    TicketCounter(int num_tickets, int ticket_counter) {
        System.out.println(
                "\n\nCreating Ticket Counter with " + num_tickets + " tickets and counter number is " + ticket_counter);
        System.out.println("\n");
        this.num_tickets = num_tickets;
        this.ticket_counter = ticket_counter;
    }

    void viewAvaiableTickets() {
        System.out.println("Avaiable Tickets: " + num_tickets);
        System.out.println("\n");
    }

    void buyTickets(int n) {
        System.out.println("Buying " + n + " Tickets");

        if (n < num_tickets) {
            num_tickets -= n;
            System.out.println("Succesfull Transaction\n");
        } else {
            System.out.println("Failed! Insuffecient tickets, Try again later!\n");
        }
    }

    void cancleTickets(int n) {
        System.out.println("Cancelling " + n + " Tickets");
        System.out.println("Successfully Cancelled " + n + " Tickets\n");
        num_tickets += n;

    }
}

public class program9 {
    public static void main(String[] args) {
        TicketCounter t1 = new TicketCounter(100, 1);
        t1.viewAvaiableTickets();
        t1.buyTickets(50);
        t1.viewAvaiableTickets();
        t1.cancleTickets(20);
        t1.viewAvaiableTickets();
        t1.buyTickets(88);
        t1.viewAvaiableTickets();
    }
}
