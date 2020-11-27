package replace_delegation_with_inheritance.after;

public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return name.substring(name.lastIndexOf(' ') + 1);
    }
}
