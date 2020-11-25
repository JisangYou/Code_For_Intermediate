package Extract_Method;

public class extractMethod {
    public static void main(String[] args) {

        System.out.println(new extractMethod());

    }

    private void printBanner() {
        // ~~
    }

    // before
    void before_print0wing(double amount, String name) {
        printBanner();

        System.out.println("name: " + name);
        System.out.println("amount:" + amount);
    }

    // after
    void after_print0wing(double amount, String name) {
        printBanner();
        printDetails(amount, name);

    }

    void printDetails(double amount, String name) {
        System.out.println("name: " + name);
        System.out.println("amount:" + amount);
    }

}
