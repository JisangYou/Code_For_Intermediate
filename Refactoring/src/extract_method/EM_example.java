package extract_method;

/**
 * 메서드 추출
 * 방법 : 어떤 코드를 그룹으로 묶어도 되겠다고 판단될 때 그 코드를 빼내어 목적을 잘 나타내는 직관적 이름의 메서드로 만든다.
 *
 */
public class EM_example {

    // before
    // fixme
    // 해당 메서드 주석 처리하기.
//    public void print0wing(double amount, String name) {
//        printBanner();
//
//        System.out.println("name: " + name);
//        System.out.println("amount:" + amount);
//    }

    // after
    // todo 주석 제거한다.
    public void print0wing(double amount, String name) {
        printBanner();
        printDetails(amount, name);

    }

    // todo
    // 직관적인 이름으로 메서드 명을 정하고, 그에 걸맞는 목적으로 메서드를 만들어서 추출한다.
    private void printDetails(double amount, String name) {
        System.out.println("name: " + name);
        System.out.println("amount:" + amount);
    }


    private void printBanner() {
        // Some Code
    }
}
