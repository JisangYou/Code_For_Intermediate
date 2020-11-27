package introduce_foreign_method.after;

import java.time.LocalDate;

public class IFM_example {

    private LocalDate previousEnd;

    public IFM_example(LocalDate previousEnd) {
        this.previousEnd = previousEnd;
    }

    public void someMethod() {
        LocalDate newStart = nextDay(previousEnd);
        // do something
    }

    // TODO 원본 클래스에 수정이 불가능한 경우, 그 메서드를 클라이언트 클래스안에 작성해야한다.
    // 또한,
    private static LocalDate nextDay(LocalDate previousEnd) {
        // DateTime 클래스에 있어야 하는 외래 메서드
        return LocalDate.of(previousEnd.getYear(), previousEnd.getMonthValue(), previousEnd.getDayOfMonth() + 1);
    }
}
