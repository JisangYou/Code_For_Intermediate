package preserve_whole_object.after;

public class HeatingPlan {
    private TempRange range;

    // before에서는 TempRange 객체를 넘겨서 해당 클래스에서 처리하게 되는 구조.
    boolean withinRange(TempRange roomRange) {
        return range.includes(roomRange);
    }
}
