package Introduce_local_Extension.after;

import java.util.Date;

// TODO 래퍼 클래스로 라이브러리를 커스텀 하는 법
public class DateWrapper {
    private Date original;

    public DateWrapper(long dateLong) {
        original = new Date(dateLong);
    }

    public DateWrapper(String dateString) {
        original = new Date(dateString);
    }

    public DateWrapper(int year, int month, int date) {
        original = new Date(year, month, date);
    }

    public DateWrapper(int year, int month, int date, int hrs, int min) {
        original = new Date(year, month, date, hrs, min);
    }

    public DateWrapper(int year, int month, int date, int hrs, int min, int sec) {
        original = new Date(year, month, date, hrs, min, sec);
    }

    public DateWrapper(Date date) {
        original = date;
    }

    private int getDate() {
        return original.getDate();
    }

    private int getMonth() {
        return original.getMonth();
    }

    private int getYear() {
        return original.getYear();
    }

    public Date nextDay() {
        return new Date(getYear(), getMonth(), getDate() + 1);
    }
}
