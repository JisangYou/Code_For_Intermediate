package substitute_algorithm;

import java.util.Arrays;
import java.util.List;

/**
 * 알고리즘 전환
 * 방법 : 알고리즘을 더 분명한 것으로 교체해야 할 땐 해당 메서드의 내용을 새 알고리즘으로 바꾼다.
 * use case: 복잡한 알고리즘을 간단한 알고리즘으로 바꾼다.
 */
public class SA_example {

    // before
    public String foundPerson(String[] people) {
        for (int i = 0; i < people.length; i++) {
            if (people[i].equals("Don")) {
                return "Don";
            }

            if (people[i].equals("John")) {
                return "John";
            }

            if (people[i].equals("Kent")) {
                return "Kent";
            }
        }

        return "";
    }

    // after
    public String foundPersonNew(String[] people) {
        List candidates = Arrays.asList("Don", "John", "Kent");
        for (int i = 0; i < people.length; i++) {
            if (candidates.contains(people[i]))
                return people[i];
        }
        return "";

    }
}
