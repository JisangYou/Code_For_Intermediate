package replace_conditional_with_polymorphism.before;

public class Salesman extends EmployeeType {
    @Override
    int getTypeCode() {
        return EmployeeType.SALESMAN;
    }
}
