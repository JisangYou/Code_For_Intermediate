package extract_subclass.after;

public class Client {
    public static void main(String[] args) {
        Employee jun = new Employee(6);
        // 아래와 같이 좀 더 범용적으로 활용할 수 있다.
        JobItem j1 = new LaborItem(0, jun);
        JobItem j2 = new JobItem(10, 15);
    }
}
