package introduce_null_object.after;

public class Main {
    public static void main(String[] args) {
        Site site = new Site();
        // site.getCustomer()에서 이미 null 체크가 되어 나온다.
        Customer customer = site.getCustomer();

        BillingPlan plan = customer.getPlan();

        String customerName = customer.getName();

        int weeksDelinquent = customer.getHistory().getWeeksDelinquentInLastYear();
    }
}
