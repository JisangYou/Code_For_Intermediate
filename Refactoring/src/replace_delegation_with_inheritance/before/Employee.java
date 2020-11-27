package replace_delegation_with_inheritance.before;

/**
 * 위임을 상속으로 전환
 * 방법 : 위임을 이용 중인데 인터페이스 전반에 간단한 위임이로 도배하게 될땐 위임클래스를 대리객체의 하위 클래스로 만든다.
 * 주의사항: 위임하려는 클래스의 모든 메서드를 사용하는게 아닌 이상에야 위임을 상속으로 전환을 적용해선 안된다.
 *
 */

// FIXME: 위임하는 클래스에 모든 메서드를 사용하므로 리팩토링 실시
public class Employee {
    private Person person = new Person();

    public String getName() {
        return person.getName();
    }

    public void setName(String name) {
        person.setName(name);
    }

    @Override
    public String toString() {
        return "사원 : " + person.getLastName();
    }
}
