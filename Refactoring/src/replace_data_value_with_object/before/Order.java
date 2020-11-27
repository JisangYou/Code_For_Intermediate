package replace_data_value_with_object.before;


/**
 * 데이터 값을 객체로 전환
 * 방법 : 데이터 항목에 데이터나 기능을 더 추가해야 할 때는 데이터 항목을 객체로 만든다.
 *
 */
public class Order {
    private String customer;

    public Order(String customer) {
        this.customer = customer;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }
}
