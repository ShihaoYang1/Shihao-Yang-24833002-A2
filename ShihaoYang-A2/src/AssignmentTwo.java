public class AssignmentTwo {

    public static void main(String[] args) {
        AssignmentTwo app = new AssignmentTwo();
        app.partFourA();          // 专门演示 Part4A
    }

    /* ========== Part4A 演示 ========== */
    public void partFourA() {
        // 1. 创建操作员与游乐项目
        Employee op = new Employee("John", 30, "E001", "Operator", 50000);
        Ride ride = new Ride("Roller Coaster", 2, op);

        // 2. 创建 5 个游客
        Visitor v1 = new Visitor("Alice", 12, "V001", "Child", 1.2);
        Visitor v2 = new Visitor("Bob", 20, "V002", "Adult", 1.8);
        Visitor v3 = new Visitor("Charlie", 15, "V003", "Teen", 1.6);
        Visitor v4 = new Visitor("Diana", 25, "V004", "Adult", 1.7);
        Visitor v5 = new Visitor("Eve", 10, "V005", "Child", 1.1);

        // 3. 手动加入 rideHistory（模拟已玩过项目）
        ride.addVisitorToHistory(v1);
        ride.addVisitorToHistory(v2);
        ride.addVisitorToHistory(v3);
        ride.addVisitorToHistory(v4);
        ride.addVisitorToHistory(v5);

        // 4. 演示检查、计数、打印
        System.out.println("🔍  Is Charlie in history? " + ride.checkVisitorFromHistory(v3));
        System.out.println("📊  Total visitors in history: " + ride.numberOfVisitors());
        ride.printRideHistory();
    }
    public void partFourB() {
        Employee op = new Employee("John", 30, "E001", "Operator", 50000);
        Ride ride = new Ride("Roller Coaster", 2, op);

        // 故意打乱顺序
        ride.addVisitorToHistory(new Visitor("Zoe", 25, "V010", "Adult", 1.9));
        ride.addVisitorToHistory(new Visitor("Amy", 10, "V007", "Child", 1.0));
        ride.addVisitorToHistory(new Visitor("Tom", 25, "V008", "Adult", 1.75));
        ride.addVisitorToHistory(new Visitor("Eva", 10, "V009", "Child", 1.2));
        ride.addVisitorToHistory(new Visitor("Leo", 15, "V006", "Teen", 1.5));

        System.out.println("🡻  Before sorting:");
        ride.printRideHistory();

        ride.sortRideHistory();

        System.out.println("🡻  After sorting:");
        ride.printRideHistory();
    }}
