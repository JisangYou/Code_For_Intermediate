package encapsulate_collection.after;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;


public class Person {
    private Set<Course> courses = new HashSet<>();

    // 변경 불가하게 막는다.
    public Set<Course> getCourses() {
        return Collections.unmodifiableSet(this.courses);
    }

    // TODO set 대신 initialize로 메서드 명 변경
    // 쓰기 메서드가 사용되는 경우는 컬렉션이 비어있을 때와 비어있지 않을 때뿐
    public void initializeCourses(Set<Course> courses) {
        assert this.courses.isEmpty();
        this.courses.addAll(courses);
    }

    public void addCourse(Course course) {
        this.courses.add(course);
    }

    public void removeCourse(Course course) {
        this.courses.remove(course);
    }

    int numberOfAdvancedCourses() {
        int count = 0;

        for (Course course : courses) {
            if (course.isAdvanced()) count++;
        }

        return count;
    }

    int numberOfCourses() {
        return this.courses.size();
    }
}
