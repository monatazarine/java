//Box is going to act like a container

//We don't know the type of data that is going to be stored
//box is going to be reusable
public class Box <T>{
    T item ;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return this.item;
    }
}
