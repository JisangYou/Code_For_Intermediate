package introduce_null_object.after;

class NullCustomer extends Customer {
    // null일 경우에 조건에 따라 세팅되는 값들을 따로 정의한 데이터 클래스라고 보여진다.
    @Override
    boolean isNull() {
        return true;
    }

    @Override
    String getName() {
        return "occupant";
    }

    @Override
    BillingPlan getPlan() {
        return BillingPlan.special();
    }

    @Override
    PaymentHistory getHistory() {
        return PaymentHistory.newNull();
    }
}
