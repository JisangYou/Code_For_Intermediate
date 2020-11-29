package preserve_whole_object.after;

public class HeatingPlan {
    private TempRange range;

    // todo
    // 리팩토링 후에는 TempRange 클래스 객체가 일괄적으로 로직을 처리해서 그 결과값만 전달해주는 형태로 변경되었다.
    boolean withinRange(TempRange roomRange) {
        return range.includes(roomRange);
    }
}
