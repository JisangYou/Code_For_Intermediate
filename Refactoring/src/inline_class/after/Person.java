package inline_class.after;

public class Person {
    private String _name;
    private String _areaCode;

    // 전화 번호 클래스 기능 옮기고, 해당 클래스 삭제함으로써 리팩토링
    private String _number;

    public String getName() {
        return _name;
    }

    public String getTelephoneNumber() {
        return "(" + _areaCode + ") " + _number;
    }

    public String getAreaCode() {
        return _areaCode;
    }

    public void setAreaCode(String _areaCode) {
        this._areaCode = _areaCode;
    }

    public String getNumber() {
        return _number;
    }

    public void setNumber(String number) {
        this._number = number;
    }
}