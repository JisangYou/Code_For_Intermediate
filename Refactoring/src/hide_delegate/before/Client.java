package hide_delegate.before;

/**
 * 대리 객체 은폐
 * 방법 : 클라이언트가 객체의 대리 클래스를 호출할 땐 대리 클래스를 감추는 메서드를 서버에 작성한다.
 * 객체에서 핵심 개념 중 하나가 바로 캡슐화인데, 이는 객체가 시스템의 다른 부분에 대한 정보의 일부만 알 수 있게 은폐하는 것을 뜻한다.
 * 객체를 캡슐화 하면 무언가를 변경할 때 그 변화를 전달해야 할 객체가 줄어들므로 변경하기가 쉬워짐.
 */
public class Client {
    public static void main(String[] args) {
        Person john = new Person();
        Person johnsManager = new Person();
        john.setDepartment(new Department(johnsManager));


        // fixme
        // 아래는 Department 클래스의 기능이 팀장의 정보를 지속적으로 알아내는 것임을 알 수 있다.
        // 메서드 체인 형태로, 캡슐화 관점에서 은닉이 이루어지지 않았음.
        Person manager = john.getDepartment().getManager();
    }
}
