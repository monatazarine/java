
public class Friend {

    static  int numbOfFriends;
    String name;

    Friend(String name){
        this.name = name;
        numbOfFriends ++;
    }
    //static method
    //using numbOfFriends without "this" cuz its a static att
    static void showFriends(){
        System.out.println("You have " + numbOfFriends + " total friends!");
    }
}
