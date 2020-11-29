package preserve_whole_object.before;

/**
 * 객체를 통째로 전달 (Preserve Whole Object)
 * 방법 : 객체에서 가져온 여러 값을 메서드 호출에서 매개변수로 전달할 땐 그 객체를 통째로 전달하게 수정한다.
 * use case : 객체가 한 객체에 든 여러 값을 메서드 호출할 때 매개변수로 전달하고 있다면 이 기법을 사용 추천
 * 단점: 통 객체를 전달하면, 통 객체와 호출한 객체가 서로 의존하게 되는데 이게 만약 의존성을 망가 뜨릴 것 같으면 사용하지 않는다.
 */
public class Room {
    //fixme
    //매개변수별로 넘기는게 아니라 객체 자체를 넘기는 게 필요하다.
    boolean withinPlan(HeatingPlan plan) {
        int low = daysTempRange().getLow();
        int high = daysTempRange().getHigh();

        return plan.withinRange(low, high);
    }

    private TempRange daysTempRange() {
        return new TempRange();
    }
}
