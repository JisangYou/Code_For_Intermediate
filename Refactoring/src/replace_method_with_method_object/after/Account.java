package replace_method_with_method_object.after;

public class Account {
    int gamma(int inputVal, int quantity, int yearToDate) {
        // 메서드 객체화 한것을 객체로 사용한다.
        return new Gamma(this, inputVal, quantity, yearToDate).compute();
    }

    int delta() {
        return 0;
    }
}
