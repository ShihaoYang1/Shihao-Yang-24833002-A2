import java.util.*;

public class Ride implements RideInterface {
    private String name;
    private int maxRiders;
    private Employee operator;
    private Queue<Visitor> waitingLine = new LinkedList<>();
    private LinkedList<Visitor> rideHistory = new LinkedList<>();

    public Ride() {}

    public Ride(String name, int maxRiders, Employee operator) {
        this.name = name;
        this.maxRiders = maxRiders;
        this.operator = operator;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getMaxRiders() { return maxRiders; }
    public void setMaxRiders(int maxRiders) { this.maxRiders = maxRiders; }

    public Employee getOperator() { return operator; }
    public void setOperator(Employee operator) { this.operator = operator; }

    // Part 3: Queue methods
    public void addVisitorToQueue(Visitor v) {
        waitingLine.offer(v);
        System.out.println("✅ " + v.getName() + " added to queue.");
    }

    public void removeVisitorFromQueue() {
        Visitor v = waitingLine.poll();
        if (v != null) {
            System.out.println("🚪 " + v.getName() + " removed from queue.");
        } else {
            System.out.println("❌ Queue is empty.");
        }
    }

    public void printQueue() {
        System.out.println("🎢 Waiting Line:");
        for (Visitor v : waitingLine) {
            System.out.println(v);
        }
    }

    // Part 4A: Ride history
    public void addVisitorToHistory(Visitor v) {
        rideHistory.add(v);
        System.out.println("📜 " + v.getName() + " added to ride history.");
    }

    public boolean checkVisitorFromHistory(Visitor v) {
        return rideHistory.contains(v);
    }

    public int numberOfVisitors() {
        return rideHistory.size();
    }

    public void printRideHistory() {
        System.out.println("📚 Ride History:");
        Iterator<Visitor> it = rideHistory.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    // Part 5: Run one cycle
    private int numOfCycles = 0;

    public void runOneCycle() {
        if (operator == null) {
            System.out.println("❌ No operator assigned.");
            return;
        }

        if (waitingLine.isEmpty()) {
            System.out.println("❌ No visitors in queue.");
            return;
        }

        int count = 0;
        while (!waitingLine.isEmpty() && count < maxRiders) {
            Visitor v = waitingLine.poll();
            rideHistory.add(v);
            count++;
        }

        numOfCycles++;
        System.out.println("🎢 Ride cycle " + numOfCycles + " completed with " + count + " visitors.");
    }
    /**
     * Part4B：按年龄+身高对 rideHistory 进行升序排序
     */
    public void sortRideHistory() {
        rideHistory.sort(new VisitorComparator());
        System.out.println("✅  Ride history sorted by age + height.");
    }
}
