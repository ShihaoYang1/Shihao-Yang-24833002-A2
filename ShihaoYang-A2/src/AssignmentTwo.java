package assignment2;

public class AssignmentTwo {
    public static void main(String[] args) {
        AssignmentTwo app = new AssignmentTwo();
        app.partThree();
        app.partFourA();
        app.partFive();
    }

    public void partThree() {
        Ride ride = new Ride("Roller Coaster", 2);
        ride.addVisitorToQueue(new Visitor("Alice", 20, "V001", "T1001", 1.65));
        ride.addVisitorToQueue(new Visitor("Bob", 25, "V002", "T1002", 1.75));
        ride.addVisitorToQueue(new Visitor("Charlie", 30, "V003", "T1003", 1.80));
        ride.printQueue();
        ride.removeVisitorFromQueue();
        ride.printQueue();
    }

    public void partFourA() {
        Ride ride = new Ride("Water Ride", 4);
        Visitor v1 = new Visitor("Dave", 22, "V004", "T1004", 1.70);
        ride.addVisitorToHistory(v1);
        ride.addVisitorToHistory(new Visitor("Eve", 28, "V005", "T1005", 1.68));
        System.out.println("Number of visitors in history: " + ride.numberOfVisitors());
        System.out.println("Is Dave in history? " + ride.checkVisitorFromHistory(v1));
        ride.printRideHistory();
    }

    public void partFive() {
        Ride ride = new Ride("Thunderstorm", 2);
        ride.setOperator(new Employee("John", 40, "E001", "EMP1001", "Operator"));

        for (int i = 1; i <= 5; i++) {
            ride.addVisitorToQueue(new Visitor("Visitor" + i, 20 + i, "V" + i, "T" + i, 1.70));
        }

        ride.printQueue();
        ride.runOneCycle();
        ride.printQueue();
        ride.printRideHistory();
    }
}