package introduce_parameter_object.before;

import java.util.Date;
import java.util.List;


/**
 * 매개변수 세트를 객체로 전환(Introduce Parameter Object)
 * 여러 개의 매개변수가 항상 붙어 다닐 땐 그 매개변수들을 객체로 바꾸자.
 * 방법 &  use case: 여러개의 매개변수가 항상 같이 붙어 다닐 때는 객체로 바꿔서 그걸 매개변수로 전달한다.
 *
 */

public class Account {
    private List<Entry> entries;

    // 매개변수 start, end가 늘 붙어다는 매개변수라고 가정할 때, 이를 리팩토링 한다.
    double getFlowBetween(Date start, Date end) {
        double result = 0;
        for (Entry each : entries) {
            if (each.getDate().equals(start)
                    || each.getDate().equals(end)
                    || (each.getDate().after(start) && each.getDate().before(end))) {
                result += each.getValue();
            }
        }
        return result;
    }
}
