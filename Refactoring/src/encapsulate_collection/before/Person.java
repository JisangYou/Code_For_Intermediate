package encapsulate_collection.before;

import java.util.Set;

/**
 * 컬렉션 캡슐화
 * 방법 : 메서드가 컬렉션을 반환할 땐 그 메서드가 읽기전용 뷰를 반환
 * 주의점 : 읽기 메서드느 컬렉션 객체 자체를 반환해선 안된다. ( 참조 부분이 컬렉션의 내용을 조작해도 그 컬렉션이 든 클래스는 무슨일이 일어나는지 모르기 때문)
 * 쓰기 메서드는 절대 있으면 안됨 -> 원소를 추가하는 메서드와 삭제하는 메서드를 대신 사용해야함.
 */
public class Person {
    private Set<Course> courses;

    // fixme
    public Set<Course> getCourses() {
        return courses;
    }

    // fixme 쓰기 메서드를 사용하지 않아야함.
    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }
}
