package preserve_whole_object.after;

public class TempRange {
    private int low;
    private int high;

    public int getLow() {
        return low;
    }

    public int getHigh() {
        return high;
    }

    // 이 부분에서 값이 처리 되어진다.
    boolean includes(TempRange arg) {
        return (arg.getLow() >= this.getLow() && arg.getHigh() <= this.getHigh());
    }
}
