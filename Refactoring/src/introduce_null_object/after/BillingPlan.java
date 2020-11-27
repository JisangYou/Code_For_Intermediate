package introduce_null_object.after;

public class BillingPlan {
    static BillingPlan basic() {
        return new BillingPlan();
    }

    static BillingPlan special() {
        return new BillingPlan();
    }
}
