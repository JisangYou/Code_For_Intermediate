package replace_inheritance_with_delegation.before;

import java.util.Vector;

/**
 * 상속을 위임으로 전환
 * 방법: 하위클래스가 상위클래스 인터페이스의 일부만 사용할 때나 데이터를 상속받지 않게 해야 할 땐
 * 상위클래스에 필드를 작성하고, 모든 메서드가 그 상위클래스에 위임하게 수정한 후 하위클래스를 없애자.
 *
 */

// FIXME : 상속은 휼륭하지만, 떄로는 적합하지 않은 경우도 있다.
public class MyStack<T> extends Vector<T> {
    public void push(T element) {
        insertElementAt(element, 0);
    }

    public T pop() {
        T result = firstElement();
        removeElementAt(0);
        return result;
    }
}
