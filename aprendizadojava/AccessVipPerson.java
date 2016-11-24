package aprendizadojava;

/**
 * Created by Hecton on 24/11/2016.
 */
public class AccessVipPerson {
    public static void main(String[] args){

        VipPerson person = new VipPerson();
        System.out.println(person.getName());

        VipPerson person2 = new VipPerson("Lena", 2500.00);
        System.out.println(person2.getName());

        VipPerson person3 = new VipPerson("Dima", 500.00, "dima@dima.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmailAddress());


    }
}
