package encapsulate_field;

/**
 * 필드 캡슐화
 * 방법 : public 필드가 있을 땐 그 필드를 private로 만들고 필드용 읽기 메서드와 쓰기 메서드를 작성하자.
 * 캡슐화는 곧 데이터 은닉이라고 불리며, 데이터는 절대로 public으로 호출하면 안된다.
 */
public class Product {
    // before
    // fixme
//    public String name;
//    public int price;

    // after
    //todo
    private String name;
    public int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
