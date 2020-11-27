package replace_conditional_with_polymorphism.after;

public class Salesman extends EmployeeType {
    @Override
    int getTypeCode() {
        return EmployeeType.SALESMAN;
    }

    @Override
    int payAmount(Employee emp) {
        return emp.getMonthlySalary() + emp.getCommission();
    }
}
