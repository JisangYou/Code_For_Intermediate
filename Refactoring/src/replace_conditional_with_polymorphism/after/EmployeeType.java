package replace_conditional_with_polymorphism.after;

abstract class EmployeeType {
    public static final int ENGINEER = 0;
    public static final int SALESMAN = 1;
    public static final int MANAGER = 2;

    abstract int getTypeCode();
    // 추상 클래스를 통해 상속 받는 곳은 강제로 아래 추상 메서드를 구현해야 하고, 재정의 한다면
    // 객체 생성간에 자연스럽게 payAmount를 객체 형태에 맞게 return 할 수 있다.
    // Employee 객체를 파라미터로..
    abstract int payAmount(Employee emp);
}
