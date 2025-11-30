public class Visitor extends Person {
    private String ticketType;
    private double height;

    public Visitor() {}

    public Visitor(String name, int age, String id, String ticketType, double height) {
        super(name, age, id);
        this.ticketType = ticketType;
        this.height = height;
    }

    public String getTicketType() { return ticketType; }
    public void setTicketType(String ticketType) { this.ticketType = ticketType; }

    public double getHeight() { return height; }
    public void setHeight(double height) { this.height = height; }

    @Override
    public String toString() {
        return getName() + " (" + getId() + "), Ticket: " + ticketType + ", Height: " + height;
    }
}