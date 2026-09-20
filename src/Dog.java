
public class Dog extends Animal{

    private String name;
    private String breed;
    private int lifespan;         

    Dog(String name, String breed, int lifespan){
        this.name = name;
        this.breed = breed;
        this.lifespan = lifespan;
    }         

    String getName(){
        return this.name;
    }
    String getBreed(){
        return this.breed;
    }
    String getLifespan(){
        return String.valueOf(this.lifespan);
    }

    void setName(String name){
        this.name = name;
    }         
    @Override
    void makeSound() {
        System.out.println("Woof! Woof!");
    }

}
