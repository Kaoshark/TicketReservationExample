package MiniProject;

public class Ticket {
    //distance, journeyType, price

    public double distance;
    public  int journeyType;
    public int seatNo;
    public double price;



    //to print these values on the ticket

    public void printTicket(Bus bus){

        System.out.println(" --- Ticket details --- ");
        System.out.println("Bus number: " + bus.busNum);
        System.out.println("Distance: "+ this.distance);
        System.out.println("Type of journey: "+ (this.journeyType ==1 ? "One way " : "Round trip"));
        System.out.println("Seat no : " + this.seatNo);
        System.out.println("Total price: " + this.price);
        System.out.println("Have a nice trip!");
    }






}
