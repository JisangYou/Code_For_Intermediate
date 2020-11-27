package introduce_null_object.after;

public class Customer {
    private String name;
    private BillingPlan plan;
    private PaymentHistory history;

    String getName() {
        return name;
    }

    BillingPlan getPlan() {
        return plan;
    }

    PaymentHistory getHistory() {
        return history;
    }

    // 여기에 추가.
    boolean isNull() {
        return false;
    }

    // TODO 키포인트: 계속 null 체크를 하는 객체에 대한 null 객체를 따로 만든다.
    static Customer newNull() {
        return new NullCustomer();
    }
}
