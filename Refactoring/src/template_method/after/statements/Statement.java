package template_method.after.statements;

import template_method.after.Consumer;
import template_method.after.Rental;

import java.util.List;

// 공통적으로 사용되는 부분은 이와 같은 클래스로 추상화 시킨다.
public abstract class Statement {
    // 공통 메서드
    public String value(Consumer consumer) {
        StringBuilder result = new StringBuilder(headerString(consumer));
        List<Rental> rentals = consumer.getRentals();

        for (Rental rental : rentals) {
            // 이번에 대여하는 비디오 정보와 대여료를 출력
            result.append(eachRentalString(rental));
        }

        // 푸터 행 추가
        result.append(footerString(consumer));

        return result.toString();
    }

    // 재정의가 필요한 메서드
    abstract String headerString(Consumer consumer);
    abstract String eachRentalString(Rental rental);
    abstract String footerString(Consumer consumer);
}
