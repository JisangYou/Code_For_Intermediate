package hide_delegate.after;

public class Client {
    public static void main(String[] args) {
        Person john = new Person();
        Person johnsManager = new Person();
        john.setDepartment(new Department(johnsManager));


        // todo
        // 메서드 체인을 끊고 해당 클래스에서 메서드를 별도로 만들어 준다.
        Person manager = john.getManager();
    }
}
