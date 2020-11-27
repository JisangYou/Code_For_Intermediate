package replace_data_value_with_object.after;

// 주로 네트워크 통신 간에 아래와 같은 형태로 쓰는 경우가 있다.,
public class Order {
    private Customer customer;

    public Order(String customerName) {
        this.customer = new Customer(customerName);
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public void setCustomer(String customer) {
        this.customer = new Customer(customer);
    }
}
