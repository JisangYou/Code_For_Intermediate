package pullup_method.after;

import java.util.Date;

public class RegularCustomer extends Customer {

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


    //  이 부분은 Customer 추상 클래스에서 기능이 같으므로, 리팩토링이 이루어짐.
//    void createBill(Date date) {
//        double changeAmount = changeFor(lastBillDate, date);
//        addBill(date, changeAmount);
//    }
//
//    private void addBill(Date date, double changeAmount) {
//    }
//
}
