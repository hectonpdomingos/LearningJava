package aprendizadojava;

/**
 * Created by Hecton on 24/11/2016.
 */

//inheritance
public class Animal {
    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;

    //constructor
    public Animal(String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    public void eat(){

        System.out.println("Animal.eat() called");
    }
    public void move(){


    }

    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }
}
