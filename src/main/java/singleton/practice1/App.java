package singleton.practice1;

public class App {
  public static void main(String[] args) {
    TicketMaker ticketMaker1 = TicketMaker.getInstance();
    TicketMaker ticketMaker2 = TicketMaker.getInstance();
    System.out.println(ticketMaker1.getNextTicketNumber());
    System.out.println(ticketMaker2.getNextTicketNumber());
    System.out.println(ticketMaker2.getNextTicketNumber());
    System.out.println(ticketMaker1.getNextTicketNumber());
  }
}
