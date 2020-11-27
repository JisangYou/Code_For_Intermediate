package replace_inheritance_with_delegation.after;

import java.util.Vector;

// TODO: 다음과 같이 위임을 사용하여, 사용하려는 상위 클래스의 일부 기능만 빼서 클래스를 커스터마이징 한다.
public class MyStack<T> {
    private Vector<T> vector = new Vector<>();

    public void push(T element) {
        vector.insertElementAt(element, 0);
    }

    public T pop() {
        T result = vector.firstElement();
        vector.removeElementAt(0);
        return result;
    }

    public int size() {
        return vector.size();
    }

    public boolean isEmpty() {
        return vector.isEmpty();
    }
}
