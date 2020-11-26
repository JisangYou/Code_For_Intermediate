package replace_method_with_method_object.before;


/**
 * 메서드를 메서드 객체로 전환(Replace Method with Method Object)
 * 방법: 지역 변수때문에 메서드 추출을 적용할 수 없는 긴 메서드가 있을 땐 그 메서드 자체를 객체로 전환해서 모든 지역변수를 객체의 필드를 만든다. 그런 후 다음 그 메서드를 객체안의 여러 메서드로 쪼갠다.\
 * use case: 간결한 메서드들 만들어야 하는 상황.
 */
public class Account {
    int gamma(int inputVal, int quantity, int yearToDate) {
        int importantValue1 = (inputVal * quantity) + delta();
        int importantValue2 = (inputVal * yearToDate) + 100;

        if (yearToDate - importantValue1 > 100) {
            importantValue2 -= 20;
        }

        int importantValue3 = importantValue2 * 7;

        // 기타 작업
        return importantValue3 -2 * importantValue1;
    }

    private int delta() {
        return 0;
    }
}
