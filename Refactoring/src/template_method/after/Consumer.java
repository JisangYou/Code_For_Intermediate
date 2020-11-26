package template_method.after;

import template_method.after.statements.HtmlStatement;
import template_method.after.statements.TextStatement;

import java.util.List;

public class Consumer {
    private String name;
    private List<Rental> rentals;


    public List<Rental> getRentals() {
        return rentals;
    }

    public String getName() {
        return name;
    }

    public int getTotalFrequentRentalPoints() {
        return 0;
    }

    public int getTotalCharge() {
        return 0;
    }

    public String statement() {
        // 다른 부분은 아래와 같이 객체를 생성해서 별도로 관리해준다.
        return new TextStatement().value(this);
    }

    public String htmlStatement() {
        // 다른 부분은 아래와 같이 객체를 생성해서 별도로 관리해준다.
        return new HtmlStatement().value(this);
    }
}