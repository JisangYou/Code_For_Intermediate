package pullup_method.after;

import java.util.Date;

// before에서 보면, 클래스 명 및 기능으로 부모, 자식 클래스를 구분 지어 볼 수 있다.
// 부모클래스에서 공통 부분 구현과 설계가 완료되면 자식 클래스에서 상속받아 기능을 확장 시 이롭기에 추상 클래스로 변경함.
public abstract class Customer {

    Date lastBillDate;

    // 앞서, before 양 하위 클래스에 공통적인 기능으로 쓰이는 아래 메서드는 상위 클래스으로 옮겼다.
    void createBill(Date date) {
        double changeAmount = changeFor(lastBillDate, date);
        addBill(date, changeAmount);
    }

    void addBill(Date date, double amount) {
        // do something
    }

    // 아래메서드는 하위 클래스마다 다르므로, 추상화 메서드를 통해서 하위클래스에서 재정의 할 수 있도록 강제화. 프로그램의 표준화를 높힌다!
    abstract double changeFor(Date lastBillDate, Date date);
}
