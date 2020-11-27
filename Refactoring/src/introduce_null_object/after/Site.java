package introduce_null_object.after;

class Site {
    private Customer customer;

    Customer getCustomer() {
        return customer == null ? Customer.newNull() : customer;
    }
}
