package extract_subclass.after;

// 상위 JobItem을 상속받아.
public class LaborItem extends JobItem {
    private Employee employee;

    public LaborItem(int quantity, Employee employee) {
        super(0, quantity);
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    @Override
    protected boolean isLabor() {
        return true;
    }

    @Override
    public int getUnitPrice() {
        return employee.getRate();
    }
}
