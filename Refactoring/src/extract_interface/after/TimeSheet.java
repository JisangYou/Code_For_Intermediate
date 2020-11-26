package extract_interface.after;

public class TimeSheet {
    // 해당 메서드를 사용 측에서 인터페이스 객체를 만들어, 값을 세팅하는 등에 과정이 있음.
    double charge(Billable billable, int days) {
        int base = billable.getRate() * days;

        if (billable.hasSpecialSkill()) {
            return base * 1.05;
        } else {
            return base;
        }
    }
}
