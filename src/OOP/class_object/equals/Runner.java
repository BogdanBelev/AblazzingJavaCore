package OOP.class_object.equals;

public class Runner {
    public static void main(String[] args) {
        Child child1 = new Child("Denis Pes", 2011);
        Child child2 = new Child("Denis Loh", 2011);
        Child child3 = new Child("Bogdan Coolman", 2002);
        Child child4 = new Child("Roman Bosyak", 2020);

        Child[] children = new Child[]{child1, child2, child3, child4};
        ChildrenGarden childrenGarden = new ChildrenGarden(children);

        boolean result = false;
        Child denisLoh = new Child("Denis Loh", 2011);

        for (Child child : childrenGarden.getChildren()) {
            if(child.equals(denisLoh)){
                result = true;
                break;
            }
        }
        System.out.println(result);

    }
}
