package template_method.after.statements;

import template_method.after.Consumer;
import template_method.after.Rental;

public class TextStatement extends Statement {
    @Override
    String headerString(Consumer consumer) {
        return consumer.getName() + " 고객님의 대여 기록\n";
    }

    @Override
    String eachRentalString(Rental rental) {
        return "\t" + rental.getMovie().getTitle() + "\t" + String.valueOf(rental.getCharge()) + "\n";
    }

    @Override
    String footerString(Consumer consumer) {
        return "누적 대여료 : " + String.valueOf(consumer.getTotalCharge()) +
                "적립 포인트 : " + String.valueOf(consumer.getTotalFrequentRentalPoints());
    }
}
