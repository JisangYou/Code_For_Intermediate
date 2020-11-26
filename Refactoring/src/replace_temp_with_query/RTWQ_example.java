package replace_temp_with_query;

/**
 * 임시변수를 메서드 호출로 전환
 * 방법 : 수식의 결과를 저장하는 임시변수가 있을 땐, 그 수식을 빼내어 메서드로 만든 후, 임시변수 참조 부분을 전부 수식으로 교체한다.
 * 새로 만든 메서드는 다른 메서드에서 호출 가능하다.
 */
public class RTWQ_example {
    private double _itemPrice;
    private double _quantity;

    // 아래와 같이 method()를 외부에서 호출해서 사용한다.
    double method() {
        double bestPrice = _quantity * _itemPrice;

        if (bestPrice > 1000) {
            return bestPrice * 0.95;
        } else {
            return bestPrice * 0.98;
        }
    }
}
