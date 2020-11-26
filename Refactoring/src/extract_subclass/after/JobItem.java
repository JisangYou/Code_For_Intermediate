package extract_subclass.after;


// 리팩토링 전,
//    private boolean isLabor;
//    private Employee employee;
// 이라는 변수 및 해당 메서드들이 있었으나 이를 LaborItem라는 하위 클래스로 만들어서 관리.
public class JobItem {
    private int unitPrice;
    private int quantity;


    protected JobItem(int unitPrice, int quantity) {
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public int getTotalPrice() {
        return getUnitPrice() * quantity;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    protected boolean isLabor() {
        return false;
    }
}
