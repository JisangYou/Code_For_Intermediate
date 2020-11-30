package decompose_conditional.after;

import java.util.Date;

public class DC_example {
    private static final Date SUMMER_START = new Date();
    private static final Date SUMMER_END = new Date();

    private int winterRate;
    private int summerRate;
    private int winterServiceCharge;

    // todo
    // 아래와 같은 형태의, 짧은 코드라인 계산 값들 등을 메서드로 빼냄으로써 장점은
    // 긴 조건문일 때 좋고, '용도'를 확실히 알 수 있다. 단, 메서드 명을 용도를 확실히 알 수 있게 만든다.
    // 인다이렉션의 한 예이다.
    void method(Date date, int quantity) {
        int charge;

        if (notSummer(date)) {
            charge = winterCharge(quantity);
        } else {
            charge = summerCharge(quantity);
        }
    }

    private int summerCharge(int quantity) {
        return quantity * summerRate;
    }

    private int winterCharge(int quantity) {
        return quantity * winterRate + winterServiceCharge;
    }

    private boolean notSummer(Date date) {
        return date.before(SUMMER_START) || date.after(SUMMER_END);
    }
}
