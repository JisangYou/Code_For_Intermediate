package Introduce_local_Extension.before;

import java.util.Date;

/**
 * 국소적 상속확장 클래스 사용
 * 방법 : 사용 중인 서버 클래스에 여러 개의 메서드를 추가해야 하는데 클래스를 수정할 수 없을 땐,
 * 새 클래스를 작성하고 그 안에 필요한 여러개의 메서드를 작성하자.
 * 이 상속확장 클래스를 원본 클래스의 하위 클래스나 래퍼 클래스로 만든다.
 *
 */
public class ExtendedDate extends Date {
}
