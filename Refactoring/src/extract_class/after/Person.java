package extract_class.after;

public class Person {
    private String _name;
    // todo
    // office에 대한 정보를 담은 데이터 클래스를 따로 추출하여, TelephoneNumber 클래스로 만든다.
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
