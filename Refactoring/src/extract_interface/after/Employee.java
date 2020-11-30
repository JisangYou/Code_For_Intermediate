package extract_interface.after;

// todo
// 인터페이스가 제공하는 형태로 강제.
public class Employee implements Billable {
    private int rate;

    @Override
    public int getRate() {
        return this.rate;
    }

    @Override
    public boolean hasSpecialSkill() {
        return false;
    }
}
