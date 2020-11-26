package pullup_method.before;

import java.util.Date;

public class PreferredCustomer {

    // for test
    Date lastBillDate= new Date();

    // createBill 메서드는 같음.
    void createBill(Date date) {
        double changeAmount = changeFor(lastBillDate, date);
        addBill(date, changeAmount);
    }

    private void addBill(Date date, double changeAmount) {
    }

    // changeFor 메서드는 다름.
    private double changeFor(Date lastBillDate, Date date) {
        return 1;
    }
}
