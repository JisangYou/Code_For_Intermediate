package inline_class.before;

// fixme
// 클래스 내 변수, 메서드들을 옮기고 삭제할 수 있다!
public class TelephoneNumber {
    private String _areaCode;
    private String _number;

    public String getAreaCode() {
        return _areaCode;
    }

    public void setAreaCode(String _areaCode) {
        this._areaCode = _areaCode;
    }

    public String getTelephoneNumber() {
        return "(" + _areaCode + ") " + _number;
    }

    public String getNumber() {
        return _number;
    }

    public void setNumber(String number) {
        this._number = number;
    }
}
