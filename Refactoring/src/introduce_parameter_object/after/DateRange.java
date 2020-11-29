package introduce_parameter_object.after;

import java.util.Date;

// todo
// 매개변수용 클래스를 만든다.
public class DateRange {
    private final Date start;
    private final Date end;

    public DateRange(Date start, Date end) {
        this.start = start;
        this.end = end;
    }

    public Date getStart() {
        return start;
    }

    public Date getEnd() {
        return end;
    }

    // 조건 처리 메서드
    public boolean includes(Date arg) {
        return arg.equals(start) || arg.equals(end) || (arg.after(start) && arg.before(end));
    }
}
