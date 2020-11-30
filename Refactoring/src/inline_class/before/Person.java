package inline_class.before;

/**
 * 클래스 내용 직접 삽입
 * 방법 : 클래스에 기능이 너무 적을 땐 그 클래스의 모든 기능을 다른 클래스로 합쳐 넣고 원래의 클래스는 삭제
 * 클래스 추출과는 반대의 개념!
 */
public class Person {
    private String _name;
    // fixme
    // 아래 휴대폰 정보는 Person data 클래스에 함께 적용해도 논리적으로 문제가
    private TelephoneNumber _officeTelephone = new TelephoneNumber();

    public String getName() {
        return _name;
    }

    public String getTelephoneNumber() {
        return _officeTelephone.getTelephoneNumber();
    }

    public TelephoneNumber getOfficeTelephone() {
        return _officeTelephone;
    }
}
