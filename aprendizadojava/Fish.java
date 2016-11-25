package aprendizadojava;

/**
 * Created by Hecton on 24/11/2016.
 */
public class Fish extends Animal{

    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
        super(name, 1, 1, size, weight);

        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    public void name(){
        System.out.println("Fish.name() called " + super.getName());
    }

    private void rest(){

    }
    private void swin(){

    }
    private void moveMuscles(){
        this.moveMuscles();
    }
    private void moveBackFin(){

    }
    private void swin(int speed){
        moveMuscles();
        moveBackFin();
        super.move(speed);

    }
}
