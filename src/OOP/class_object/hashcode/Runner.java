package OOP.class_object.hashcode;

import OOP.class_object.equals.Child;

public class Runner {
    public static void main(String[] args) {
        Child child1 = new Child("Denis Pes", 2011);
        Child child2 = new Child("Denis Loh", 2011);
        Child child3 = new Child("Bogdan Coolman", 2002);
        Child child4 = new Child("Roman Bosyak", 2020);

        Child[] group0 = new Child[]{child3, child4}; //группа с нечетным годом рождения
        Child[] group1 = new Child[]{child1, child2}; //группа с четным годом рождения

        Child[][] children = {group0, group1}; //создаем детсад из 2х групп
        ChildrenGardenWithGroups childrenGardenWithGroups = new ChildrenGardenWithGroups(children);

        Child childForFind = new Child("Roman Bosyak", 2020);
        boolean result = false;

        for (Child child : childrenGardenWithGroups.getChildren()[childForFind.hashCode()]) {
            if (child.equals(childForFind)){
                result = true;
                break;
            }

        }
        System.out.println(result);

        /*если упростить:
            for (Child child : children[0]{
                child.equals(childForFind);
            }
        */



    }
}
