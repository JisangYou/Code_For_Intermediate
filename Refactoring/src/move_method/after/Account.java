package move_method.after;

public class Account {
    private AccountType _type;
    private int _daysOverdrawn;

    double overdraftCharge() {
        // 리팩토링간 AccountType으로 이동한 메서드를 아래와 같이 호출해서 사용하면 클래스가 더 간결해지고, 기능 분리가 명확해진다.
        return _type.overdraftCharge(_daysOverdrawn);
    }

    double bankCharge() {
        double result = 4.5;

        if (_daysOverdrawn > 0) {
            result += overdraftCharge();
        }

        return result;
    }
}
