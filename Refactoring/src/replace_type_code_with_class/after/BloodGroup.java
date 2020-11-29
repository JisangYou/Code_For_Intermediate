package replace_type_code_with_class.after;

public class BloodGroup {
    // todo
    // 책에서는 아래와 같이 구성을 했는데...
    // enum 클래스를 활용해서도 고민.

    public static final BloodGroup O = new BloodGroup(0);
    public static final BloodGroup A = new BloodGroup(1);
    public static final BloodGroup B = new BloodGroup(2);
    public static final BloodGroup AB = new BloodGroup(3);
    private static final BloodGroup[] values = {O, A, B, AB};

    private final int code;

    private BloodGroup(int code) {
        this.code = code;
    }

    private int getCode() {
        return code;
    }

    private static BloodGroup code(int code) {
        return values[code];
    }
}
