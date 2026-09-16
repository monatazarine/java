public class Friend {
    // to keep track of how many friends we have
    //rather than all friend obj having their own copy of numbOfFriends
    //they all are going to share one (the Friend class owns it ) and all obj have access to it
    static  int numbOfFriends;
    String name;

    Friend(String name){
        this.name = name;
        numbOfFriends ++;
    }

}
