package OOP.class_object.clone;

public class Agent implements Cloneable{
    private String name;

    public Agent(String name) {
        this.name = name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getName() {
        return name;
    }
}
