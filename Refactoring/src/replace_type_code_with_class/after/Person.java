package replace_type_code_with_class.after;

public class Person {
    // BloodGroup 클래스를 만들어, 해당 클래스에서 분류 부호를 관리하도록 구성한다.
    private BloodGroup bloodGroup;

    public Person(BloodGroup bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public void setBloodGroup(BloodGroup bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public BloodGroup getBloodGroup() {
        return bloodGroup;
    }
}
