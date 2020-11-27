package replace_conditional_with_polymorphism.after;

public class Employee {
    private int monthlySalary;
    private int commission;
    private int bonus;
    private EmployeeType type;

    int payAmount() {
        return type.payAmount(this);
    }

    private int getType() {
        return type.getTypeCode();
    }

    // ☆ 일단 변수들은 최대한 메서드화 시키고 그 이후로 로직 정리...
    public int getMonthlySalary() {
        return monthlySalary;
    }

    public int getCommission() {
        return commission;
    }

    public int getBonus() {
        return bonus;
    }
}
