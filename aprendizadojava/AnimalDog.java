package aprendizadojava;

/**
 * Created by Hecton on 24/11/2016.
 */
public class AnimalDog extends Animal {

    //Adding features that Animal doesn't have
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    //the constructor will be created auto bc this class is extends
    public AnimalDog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }
    private void shew(){
        System.out.println("Dog.shew() called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        shew();
        super.eat();
    }
}
