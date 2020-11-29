package introduce_parameter_object.after;

import java.util.List;

public class Account {
    private List<Entry> entries;

    // todo
    // DateRange 데이터 클래스를 만들어서 해당 객체만 전달한다. 추후에 매개변수가 늘어나게 되도, 해당 클래스에서 관리해주면 되므로 깔끔하게 정리가 가능하다.
    double getFlowBetween(DateRange dateRange) {
        double result = 0;
        for (Entry each : entries) {
            if (dateRange.includes(each.getDate())) {
                result += each.getValue();
            }
        }
        return result;
    }
}
