package replace_conditional_with_polymorphism.after;

public class Engineer extends EmployeeType {
    @Override
    int getTypeCode() {
        return EmployeeType.ENGINEER;
    }

    @Override
    int payAmount(Employee emp) {
        return emp.getMonthlySalary();
    }
}
