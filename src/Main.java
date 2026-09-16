
public class Main{
    public static  void main(String[] args){
        Friend friend1 = new Friend("Bob");
        Friend friend2 = new Friend("Sarah");

        //when accessing a static var or calling a static method
        //it is best to do so through the class itself
        //rather than any onj created from that class
        //instead of
        //System.out.println(friend1.numbOfFriends);
        //System.out.println(friend2.numbOfFriends);

        System.out.println(Friend.numbOfFriends);

        //result is 2




    }

}