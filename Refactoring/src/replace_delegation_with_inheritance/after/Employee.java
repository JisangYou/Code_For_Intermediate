package replace_delegation_with_inheritance.after;


// todo
// 위임을 상속으로 전환
public class Employee extends Person {
    @Override
    public String toString() {
        return "사원 : " + getLastName();
    }
}
