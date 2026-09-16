public class User {
    // these 3 fields are optional (we may or may not receive them)

    String username ;
    //optional
    String email;
    int age;
    //empty constructor (example: anonymous user)
    User(){
        this.username = "Guest";
        this.email = "Not provided";
        this.age= 0;
    }
    // a constructor for a user obj with just the username param
    User(String username){
        this.username = username;
        //default val
        this.email = "Not provided";
    }
    User(String username,String email){
        this.username = username;

        this.email = email;
    }
    User(String username,String email,int age){
        this.username = username;
        this.email = email;
        this.age = age;
    }
}

