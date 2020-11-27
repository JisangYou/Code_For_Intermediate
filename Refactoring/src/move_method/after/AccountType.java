package move_method.after;

public class AccountType {
    boolean isPremium() {
        return false;
    }

    // Account 클래스에 있는 메서드를 옮겼다.
    double overdraftCharge(double daysOverdrawn) {
        if (isPremium()) {
            double result = 10;

            if (daysOverdrawn > 7) {
                result += (daysOverdrawn - 7) * 0.85;
            }

            return result;
        } else {
            return daysOverdrawn * 1.75;
        }
    }
}
