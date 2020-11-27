package introduce_null_object.after;

class PaymentHistory {
    int getWeeksDelinquentInLastYear() {
        return 1;
    }

    static PaymentHistory newNull() {
        return new NullPaymentHistory();
    }
}
