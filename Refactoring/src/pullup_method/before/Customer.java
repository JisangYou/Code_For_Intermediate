package pullup_method.before;

import java.util.Date;

/**
 * 메서드 상향
 * 방법 : 기능이 같은 메서드가 여러 하위클래스에 들어 있을 땐 그 메서드를 상위클래스로 옮긴다.
 * use case: 메서드들이 완전히 복사해서 붙여 넣은 것 처럼 같을 경우, 다른 리팩토링 과정이 모든 마친 후 적용하는 것이 일반적. 만약 그리하지 않는 경우는 계속 수정이 이루어져야 함....
 */
public class Customer {

    Date lastBillDate;

    void addBill(Date date, double amount) {
        // do something
    }
}
