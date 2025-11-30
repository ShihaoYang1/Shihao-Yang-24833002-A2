public class AssignmentTwo {
    public static void main(String[] args) {
        AssignmentTwo app = new AssignmentTwo();
        app.partThree();
    }

    public void partThree() {
        Employee op = new Employee("John", 30, "E001", "Operator", 50000);
        Ride ride = new Ride("Roller Coaster", 2, op);

        Visitor v1 = new Visitor("Alice", 12, "V001", "Child", 1.2);
        Visitor v2 = new Visitor("Bob", 20, "V002", "Adult", 1.8);
        Visitor v3 = new Visitor("Charlie", 15, "V003", "Teen", 1.6);

        ride.addVisitorToQueue(v1);
        ride.addVisitorToQueue(v2);
        ride.addVisitorToQueue(v3);

        ride.printQueue();
        ride.removeVisitorFromQueue();
        ride.printQueue();
    }
}