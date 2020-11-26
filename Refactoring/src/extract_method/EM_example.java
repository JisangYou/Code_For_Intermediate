package extract_method;

public class EM_example {

    // before
    public void before_print0wing(double amount, String name) {
        printBanner();

        System.out.println("name: " + name);
        System.out.println("amount:" + amount);
    }

    // after =========================================
    public void after_print0wing(double amount, String name) {
        printBanner();
        printDetails(amount, name);

    }

    private void printDetails(double amount, String name) {
        System.out.println("name: " + name);
        System.out.println("amount:" + amount);
    }
    //  ==============================================

    private void printBanner() {
        // Some Code
    }
}
