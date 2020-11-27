package introduce_null_object.after;

class NullPaymentHistory extends PaymentHistory {
    @Override
    int getWeeksDelinquentInLastYear() {
        return 0;
    }
}
