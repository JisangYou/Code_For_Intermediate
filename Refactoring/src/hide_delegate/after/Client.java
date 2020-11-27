package hide_delegate.after;

public class Client {
    public static void main(String[] args) {
        Person john = new Person();
        Person johnsManager = new Person();
        john.setDepartment(new Department(johnsManager));


        Person manager = john.getManager();
    }
}
