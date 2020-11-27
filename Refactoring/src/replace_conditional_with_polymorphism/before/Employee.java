package replace_conditional_with_polymorphism.before;

/**
 * 조건문을 재정의로 전환
 * 방법: 객체 타입에 따라 다른 기능을 실행하는 조건문이 있을 땐, 조건문의 각 절을 하위 클래스의 재정의 메서드 안으로 옮기고, 원본 메서드는 abstract 타입으로 수정한다.
 */
public class Employee {
    private int monthlySalary;
    private int commission;
    private int bonus;
    private EmployeeType type;

    // Fixme : 리팩토링 필요.
    int payAmount() {
        switch(getType()) {
            case EmployeeType.ENGINEER:
                // 월급
                return monthlySalary;
            case EmployeeType.SALESMAN:
                // 월급 + 커미션
                return monthlySalary + commission;
            case EmployeeType.MANAGER:
                // 월급 + 보너스
                return monthlySalary + bonus;
            default:
                throw new RuntimeException("없는 사원입니다");
        }
    }

    private int getType() {
        return type.getTypeCode();
    }
}
