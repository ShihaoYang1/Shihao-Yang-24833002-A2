import java.util.Comparator;

public class VisitorComparator implements Comparator<Visitor> {
    @Override
    public int compare(Visitor v1, Visitor v2) {
        int ageDiff = Integer.compare(v1.getAge(), v2.getAge());
        if (ageDiff != 0) return ageDiff;          // 先按年龄
        return Double.compare(v1.getHeight(), v2.getHeight()); // 再按身高
    }
}