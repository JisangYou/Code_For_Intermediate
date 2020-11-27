package replace_conditional_with_polymorphism.after;

public class Manager extends EmployeeType {
    @Override
    int getTypeCode() {
        return EmployeeType.MANAGER;
    }

    @Override
    int payAmount(Employee emp) {
        return emp.getMonthlySalary() + emp.getBonus();
    }
}
