package decompose_conditional.before;

import java.util.Date;

/**
 * 조건문 쪼개기
 * 방법: 복잡한 조건문이 있을 땐, if, then, else 부분을 각각 메서드로 빼낸다.
 * use case : 복잡하고 장황한 조건문에서 사용한다.
 */
public class DC_example {
    private static final Date SUMMER_START = new Date();
    private static final Date SUMMER_END = new Date();
    Date date = new Date();
    private int winterRate;
    private int summerRate;
    private int winterServiceCharge;
    private int charge;
    private int quantity;


    // 아래 코드를 쪼개는 리팩토링을 해본다.
    public void method() {
        if (date.before(SUMMER_START) || date.after(SUMMER_END)) {
            charge = quantity * winterRate + winterServiceCharge;
        } else {
            charge = quantity * summerRate;
        }

    }
}
