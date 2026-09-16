
public class Main {
    public static void main (String[] args) {

        User user = new User();
        System.out.println(user.username);
        System.out.println(user.email);
        System.out.println(user.age);

        User user1 = new User("SpongeBob");
        System.out.println(user1.username);
        System.out.println(user1.email);


        User user2 = new User("Sandy","sandy@gmail.com");
        System.out.println(user2.username);
        System.out.println(user2.email);


        User user3 = new User("Patrick","Patrick@gmail.com", 32);
        System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println(user3.age);

    }


}


