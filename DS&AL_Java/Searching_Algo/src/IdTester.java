// 인스턴스 메서드(비정적 메서드)
// 클래스 메서드(정적 메서드)
// 위 둘의 차이는 메서드가 인스턴스에 포함되는지 여부
//

class Id {
    private static int counter = 0;
    private int id;

    public Id() {
        id = ++counter;
    }

    public int getId() {
        return id;
    }

    public static int getCounter() {
        return counter;
    }
}

public class IdTester {
    public static void main(String[] args) {
        Id a = new Id();
        Id b = new Id();

        System.out.println("a의 아이디 : " + a.getId());
        System.out.println("b의 아이디 : " + b.getId());

        System.out.println("부여한 아이디의 개수 : " + Id.getCounter());

    }
}
