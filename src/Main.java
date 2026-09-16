//static is a key word ,it modifies a var or method  so that it belongs to the class
//       rather than any specific obj.
//      Commonly use for utility methods to share resources
public class Main{
    public static  void main(String[] args){
        Friend friend1 = new Friend("Bob");
        Friend friend2 = new Friend("Sarah");

        System.out.println(friend1.numbOfFriends);
        System.out.println(friend2.numbOfFriends);

        //result is 1 ,1
        //each obj has their own copy of the numbOfFriends variable
        // so we are incrementing each copy by one
        //rather than the total



    }

}