package replace_method_with_method_object.after;


// todo
// before 패키지에 있던 gamma 메서드를 클래스로 만든다.
// 아래와 같이 클래스를 구성하고, 사용하는 측에서는 해당 객체를 생성하고, compute 메서드 사용하면 된다.
public class Gamma {
    private final Account account;
    private int inputVal;
    private int quantity;
    private int yearToDate;
    private int importantValue1;
    private int importantValue2;


    public Gamma(Account account, int inputVal, int quantity, int yearToDate) {
        this.account = account;
        this.inputVal = inputVal;
        this.quantity = quantity;
        this.yearToDate = yearToDate;
    }

    int compute() {
        importantValue1 = (inputVal * quantity) + account.delta();
        importantValue2 = (inputVal * yearToDate) + 100;
        if ((yearToDate - importantValue1) > 100) {
            importantValue2 -= 20;
        }
        int importantValue3 = importantValue2 * 7;
        return importantValue3 - 2 + importantValue1;

    }
}
