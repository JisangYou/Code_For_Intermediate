package preserve_whole_object.after;



public class Room {
    // todo
    // HeatingPlan 객체 withinRange로 이동 해보면, TempRange 객체를 넘기는 데,
    // 이 기법은 객체간에 의존도가 커져서 고민이 필요하다.
    boolean withinPlan(HeatingPlan plan) {
        return plan.withinRange(daysTempRange());
    }

    private TempRange daysTempRange() {
        return new TempRange();
    }
}
