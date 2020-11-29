package replace_method_with_method_object.after;

public class Account {
    //todo
    //아래와 같이 Gamma 관련 기능들을 메서드가 아닌 클래스로 따로 만들어, 관리한다.
    //이는 추후에 Account 클래스가 방대해질 때 위력을 발휘할 것이다.
    int gamma(int inputVal, int quantity, int yearToDate) {
        return new Gamma(this, inputVal, quantity, yearToDate).compute();
    }

    int delta() {
        return 0;
    }
}
