package OOP.class_object.equals;

public class Child {
    private String childName;
    private int childYear;

    public Child(String childName, int childYear) {
        this.childName = childName;
        this.childYear = childYear;
    }

    public String getChildName() {
        return childName;
    }

    public int getChildYear() {
        return childYear;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("Началось сравнение с " + this.getChildName());
        if (obj == null){
            return false;
        }
        if (obj instanceof Child child2){   //если наш obj относится к классу Child то запихиваем obj в переменную child2
            return this.getChildName().equals(child2.getChildName()) && this.getChildYear() == child2.getChildYear();
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.getChildYear() % 2;
    }
}
