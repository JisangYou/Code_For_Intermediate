package introduce_null_object.before;

class Customer {
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
}
