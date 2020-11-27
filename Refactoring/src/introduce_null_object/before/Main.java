package introduce_null_object.before;

/**
 * Null 검사를 널 객체에 위임
 * 방법: null 값을 검사하는 코드가 계속 나올 땐 null 값을 널 객체로 만든다.
 * 재정의의 본질은 어떤 종류인지를 객체에 일일이 물어서 그 응답에 따라 실행할 기능을 호출하는 것이 아니라, 묻지도 따지지도 않고 기능을 곧바로 호출하는 것.
 */
public class Main {
    public static void main(String[] args) {
        Site site = new Site();
        Customer customer = site.getCustomer();

        BillingPlan plan;
        //  FIXME : 아래와 같이 customer == null 체크를 계속 한다면....Customer을 리팩토링해봐야 한다.
        if (customer == null) {
            plan = BillingPlan.basic();
        } else {
            plan = customer.getPlan();
        }

        String customerName;
        if (customer == null) {
            customerName = "occupant";
        } else {
            customerName = customer.getName();
        }

        int weeksDelinquent;
        if (customer == null) {
            weeksDelinquent = 0;
        } else {
            weeksDelinquent = customer.getHistory().getWeeksDelinquentInLastYear();
        }
    }
}
