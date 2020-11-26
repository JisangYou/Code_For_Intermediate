package preserve_whole_object.before;

public class HeatingPlan {
    private TempRange range;

    boolean withinRange(int low, int high) {
        return (low >= range.getLow() && high <= range.getHigh());
    }
}
