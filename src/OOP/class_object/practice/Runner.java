package OOP.class_object.practice;

public class Runner {
    public static void main(String[] args) {
        user user1 = new user("bbelev", "1111");
        user user2 = new user("bbelev", "2222");

        boolean resultHashCode = false;

        if(user1.hashCode() == user2.hashCode()){
            resultHashCode = true;
        }

        System.out.println(user1.equals(user2) + "\n" + resultHashCode);

    }
}
