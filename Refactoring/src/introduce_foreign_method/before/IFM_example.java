package introduce_foreign_method.before;

import java.time.LocalDate;

/**
 * 외래 클래스에 메서드 추가
 * 방법 : 사용 중인 서버 클래스에 메서드를 추가해야 하는데 그 클래스를 수정할 수 없을 땐 클라이언트 클래스 안에 서버 클래스의 인스턴스를 첫번째 인자로 받는 메서드를 작성한다.
 */
public class IFM_example {

    private LocalDate previousEnd;

    public IFM_example(LocalDate previousEnd) {
        this.previousEnd = previousEnd;
    }

    public void someMethod() {
        LocalDate newStart = LocalDate.of(previousEnd.getYear(), previousEnd.getMonthValue(), previousEnd.getDayOfMonth() + 1);
        // do something
    }
}
