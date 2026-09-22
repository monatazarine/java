//the engine is part of the car
public class Engine {

    String type ;

    Engine(String type){
        this.type = type;
    }
    void start(){
        System.out.println("The engine "+this.type  +" started ");
    }
}
