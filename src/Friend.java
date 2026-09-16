public class Friend {
    // to keep track of how many friends we have
    int numbOfFriends;
    String name;

    Friend(String name){
        this.name = name;
        //whenever we create a new friend obj
        // we increment numbOfFriends
        numbOfFriends ++;
    }
}
