package replace_conditional_with_polymorphism.before;

public class Engineer extends EmployeeType {
    @Override
    int getTypeCode() {
        return EmployeeType.ENGINEER;
    }
}
