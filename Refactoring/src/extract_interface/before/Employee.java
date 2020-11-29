package extract_interface.before;


/**
 * 인터페이스 추출(Extract Interface)
 * 방법 : 클래스 인터페이스의 같은 부분을 여러 클라이언트가 사용하거나, 두 클래스에 인터페이스의 일부분이 공통으로 들어 있을 땐 공통 부분을 인터페이스로 빼낸다.
 *
 * 메모: 동일한 목적 하에 동일한 기능을 수행하게끔 강제하는 것이 바로 인터페이스의 역할이자 개념, 자바의 다형성을 극대화하여 개발코드 수정을 줄이고 프로그램 유지보수성을 높이기 위해 인터페이스를 사용
 */

//fixme
//여러 클라이언트가 클래스 기능 중 특정 부분만 사용할 때도 있고, 클래스마다 각 요청을 처리할 수 있는 특정한 클래스들과 공조해야 할 경우가 있다.
//그런 경우라고 가정하고 리팩토링을 한다.
public class Employee {
    private int rate;

    public int getRate() {
        return this.rate;
    }

    public boolean hasSpecialSkill() {
        return false;
    }
}
