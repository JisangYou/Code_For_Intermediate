package replace_parameter_with_method.after;


// 매개 변수들이 되는 부분을 메서드로 빼보면서 로직을 계속 체킹해본다.
public class OrderService {
    private int quantity;
    private int itemPrice;

    double getPrice() {
        if (getDiscountLevel() == 2) {
            return getBasePrice() * 0.1;
        } else {
            return getBasePrice() * 0.05;
        }
    }

    private int getBasePrice() {
        return quantity * itemPrice;
    }

    private int getDiscountLevel() {
        if (quantity > 100) {
            return 2;
        } else {
            return 1;
        }
    }
}
