package replace_type_code_with_class.before;

/**
 * 분류 부호를 클래스로 전환
 * 방법 : 기능에 영향을 미치는 숫자형 분류 부호가 든 클래스가 있을 땐 그 숫자를 새 클래스로 바꾸자.
 */
public class Person {
    // fixme
    // 아래와 혈액형에 대한 숫자형 분류 부호는 Person 클래스와 같이 있을 필요가 없다.
    // 새로 클래스를 만들어 분리한다.
    public static final int O = 0;
    public static final int A = 1;
    public static final int B = 2;
    public static final int AB = 3;

    private int bloodGroup;

    public Person(int bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public int getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(int bloodGroup) {
        this.bloodGroup = bloodGroup;
    }
}
