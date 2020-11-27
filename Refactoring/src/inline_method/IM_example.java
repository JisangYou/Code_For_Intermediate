package inline_method;

public class IM_example {

    private int _numberOfLateDeliveries;

    // before
    int getRating_before() {
        return (moreThanFiveLateDeliveries()) ? 2 : 1;
    }

    private boolean moreThanFiveLateDeliveries() {
        return _numberOfLateDeliveries > 5;
    }

    // after
    int getRating_after() {
        return (_numberOfLateDeliveries > 5) ? 2 : 1;
    }


}
