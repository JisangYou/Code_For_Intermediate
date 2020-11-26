package pullup_method.after;

import java.util.Date;

public class PreferredCustomer extends Customer {
//    RegularCustomer 와 같음.

    @Override
    void createBill(Date date) {
        super.createBill(date);
    }

    @Override
    void addBill(Date date, double amount) {
        super.addBill(date, amount);
    }

    // 부모 클래스에서 추상 메서드로 세팅했기 때문에, 구현 강요.
    @Override
    double changeFor(Date lastBillDate, Date date) {
        return 0;
    }
}
