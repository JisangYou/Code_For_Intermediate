package Introduce_local_Extension.after;

import java.util.Date;

// TODO 하위 클래스로 라이브러리를 커스텀
public class ExtendedDate extends Date {
    public ExtendedDate() {
        super();
    }

    public ExtendedDate(String dateString) {
        super(dateString);
    }

    public ExtendedDate(int year, int month, int date) {
        super(year, month, date);
    }

    public ExtendedDate(int year, int month, int date, int hrs, int min) {
        super(year, month, date, hrs, min);
    }

    public ExtendedDate(int year, int month, int date, int hrs, int min, int sec) {
        super(year, month, date, hrs, min, sec);
    }

    public ExtendedDate(Date date) {
        super(date.getTime());
    }

    public Date nextDay() {
        return new Date (getYear(), getMonth(), getDate() + 1);
    }
}
