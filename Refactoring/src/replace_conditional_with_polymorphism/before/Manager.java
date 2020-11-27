package replace_conditional_with_polymorphism.before;

public class Manager extends EmployeeType {
    @Override
    int getTypeCode() {
        return EmployeeType.MANAGER;
    }
}
