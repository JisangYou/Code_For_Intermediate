package extract_class.before;

/**
 * 클래스 추출
 * 방법: 두 클래스가 처리해야 할 기능이 하나의 클래스에 들어 있을 땐, 새 클래스를 만들고 기존 클래스의 관련 필드와 메서드를 새 클래스로 옮긴다.
 * <p>
 * use case:
 * 1. 한 클래스에 너무나 많은 메서드와 데이터가 들어가 있으며 이해하기 힘들 경우
 * 2. 데이터의 일부분과 메서드의 일부분이 한덩어리 일 경우
 * 3. 주로 함께 변화하거나 서로 유난히 의조전적인 데이터의 일부분
 */
public class Person {

    private String _name;
    private String _officeAreaCode;
    private String _officeNumber;

    public String getName() {
        return _name;
    }

    public String getTelephoneNumber() {
        return "(" + _officeAreaCode + ") " + _officeNumber;
    }

    public String getOfficeAreaCode() {
        return _officeAreaCode;
    }

    public void setOfficeAreaCode(String officeAreaCode) {
        this._officeAreaCode = officeAreaCode;
    }

    public String getOfficeNumber() {
        return _officeNumber;
    }

    public void setOfficeNumber(String officeNumber) {
        this._officeNumber = officeNumber;
    }
}
