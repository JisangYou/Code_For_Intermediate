package extract_interface.after;

// todo
// 인터페이스라는 일종의 설계도를 만들고 필요한 클래스에서 사용한다.
// 청구 가능한 행위에 대한 기능
public interface Billable {
    int getRate();
    boolean hasSpecialSkill();
}
