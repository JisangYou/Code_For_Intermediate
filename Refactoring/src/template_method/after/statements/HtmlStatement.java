package template_method.after.statements;

import template_method.after.Consumer;
import template_method.after.Rental;

// 다른 부분은 이와 같은 형태로 재정의 하고 이를 사용하는 클래스에서
public class HtmlStatement extends Statement {
    @Override
    String headerString(Consumer consumer) {
        return "<h1><em>" + consumer.getName() + "고객님의 대여 기록</em></h1><p>";
    }

    @Override
    String eachRentalString(Rental rental) {
        return rental.getMovie().getTitle() + " : " + String.valueOf(rental.getCharge()) + "<br>\n";
    }

    @Override
    String footerString(Consumer consumer) {
        return "<p>누적 대여료 : <em>" + String.valueOf(consumer.getTotalCharge()) + "</em></p>" +
                "적립 포인트 : <em>" + String.valueOf(consumer.getTotalFrequentRentalPoints()) + "</em></p>";
    }
}
