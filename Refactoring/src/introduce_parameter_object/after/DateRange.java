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

    // todo
    // 아래와 같이 사용하는 측 클래스가 아닌 객체로 위임하는 클래스에서 조건 처리를 한다면 좀 더 깔끔해진다.
    public boolean includes(Date arg) {
        return arg.equals(start) || arg.equals(end) || (arg.after(start) && arg.before(end));
    }
}
