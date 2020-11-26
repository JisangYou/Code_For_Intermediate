package duplicate_observed_data.after;

import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.Observable;
import java.util.Observer;

// 옵져버 패턴으로 구현되어 있다...

public class InternalWindow extends Frame implements Observer {
    private TextField startField;
    private TextField endField;
    private TextField lengthField;

    // 선언
    private Interval subject;

    // 관찰하고 있는 interval 객체로 gui 데이터를 세팅한다.
    String getEnd() {
        return this.subject.getEnd();
    }

    void setEnd(String text) {
        this.subject.setEnd(text);
    }

    String getStart() {
        return this.subject.getStart();
    }

    void setStart(String text) {
        this.subject.setStart(text);
    }

    String getLength() {
        return this.subject.getLength();
    }

    void setLength(String text) {
        this.subject.setLength(text);
    }
    // 여기에 옵져버 객체 세팅 밑 옵저버 세팅
    public InternalWindow() {
        this.subject = new Interval();
        this.subject.addObserver(this);
        update(subject, null);
    }

    public void update(Observable observed, Object arg) {
        this.endField.setText(subject.getEnd());
        this.startField.setText(subject.getStart());
        this.lengthField.setText(subject.getLength());
    }

    // ==================================================================================

    class SymFocus extends FocusAdapter {
        @Override
        public void focusLost(FocusEvent e) {
            Object eventSource = e.getSource();
            if (eventSource == startField) {
                StartField_FocusLost(e);
            } else if (eventSource == endField) {
                EndField_FocusLost(e);
            } else if (eventSource == lengthField) {
                LengthField_FocusLost(e);
            }
        }
    }

    private void LengthField_FocusLost(FocusEvent e) {
        setLength(this.lengthField.getText());
        if (isNotInteger(getLength())) {
            setLength("0");
        }
        calculateEnd();
    }

    private void EndField_FocusLost(FocusEvent e) {
        setEnd(this.endField.getText());
        if (isNotInteger(getEnd())) {
            setEnd("0");
        }
        calculateLength();
    }

    private void StartField_FocusLost(FocusEvent e) {
        setStart(this.startField.getText());
        if (isNotInteger(getStart())) {
            setStart("0");
        }
        calculateLength();
    }

    private boolean isNotInteger(String text) {
        try {
            Integer.parseInt(text);
        } catch (NumberFormatException e) {
            return true;
        }
        return false;
    }

    private void calculateLength() {
        try {
            int start = Integer.parseInt(getStart());
            int end = Integer.parseInt(getEnd());
            int length = start - end;
            setLength(String.valueOf(length));
        } catch (NumberFormatException e) {
            throw new RuntimeException("잘못된 숫자 형식 에러");
        }
    }

    private void calculateEnd() {
        try {
            int start = Integer.parseInt(getStart());
            int length = Integer.parseInt(lengthField.getText());
            int end = start + length;
            setEnd(String.valueOf(end));
        } catch (NumberFormatException e) {
            throw new RuntimeException("잘못된 숫자 형식 에러");
        }

    }
}