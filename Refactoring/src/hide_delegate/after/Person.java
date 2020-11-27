package hide_delegate.after;

public class Person {
    Department department;

    public void setDepartment(Department department) {
        this.department = department;
    }

    // TODO :  여기에 department의 위임 메소드를 작성하면 되고, 이를 사용하는 곳에서는 getManager만 호출하면 된다.
    public Person getManager() {
        return this.department.getManager();
    }
}
