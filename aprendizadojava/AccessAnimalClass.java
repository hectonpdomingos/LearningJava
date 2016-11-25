package aprendizadojava;

/**
 * Created by Hecton on 24/11/2016.
 */
public class AccessAnimalClass {
    public static void main(String[] args){
       // Animal animal = new Animal("Animal", 1, 1, 5, 5);
        AnimalDog dog = new AnimalDog("Bulldog", 8, 20,2,4,1,20, "long silky");
        dog.name();
        /*dog.eat();
        dog.walk();
        dog.run();*/
        Fish fish = new Fish("Lambari",1,1,2,1,1);
        System.out.println("Caracteristicas do Peixe");

        fish.name();
        fish.move(10);




    }
}
