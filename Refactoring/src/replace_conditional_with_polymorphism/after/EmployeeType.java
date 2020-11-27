package replace_conditional_with_polymorphism.after;

abstract class EmployeeType {
    public static final int ENGINEER = 0;
    public static final int SALESMAN = 1;
    public static final int MANAGER = 2;

    abstract int getTypeCode();
    // 해당 클래스를 상속받는 클래스에서는 아래의 메서드를 구현하고 매개변수로 Employee 객체전달.
    // 각 데이터 클래스에서 다형성을 활용해서 payAmount를 재정의하고 그 값을 return한다.
    abstract int payAmount(Employee emp);
}
