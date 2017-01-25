import main.java.edu.cofc.workflow.Cat;
import main.java.edu.cofc.workflow.Dog;
import main.java.edu.cofc.workflow.Parrot;
import main.java.edu.cofc.workflow.PetStore;

public class Main{
    public static void main(String[] args) {
        System.out.println("Hello World!");

        System.out.println();
        PetStore petCo = new PetStore(100.00);
        System.out.println("Funds " + petCo.getFund());
        System.out.println();

        petCo.buy(new Cat());
        petCo.buy(new Cat());
        petCo.buy(new Cat());
        petCo.buy(new Parrot());
        petCo.buy(new Parrot());
        petCo.buy(new Parrot());
        petCo.buy(new Dog());
        petCo.buy(new Dog());
        petCo.buy(new Dog());
        petCo.getInventory();

        System.out.println();
        System.out.println("Funds " + petCo.getFund());
        System.out.println();

        petCo.buy(new Cat());
        petCo.buy(new Cat());
        petCo.buy(new Cat());
        petCo.buy(new Parrot());
        petCo.buy(new Parrot());
        petCo.buy(new Parrot());
        petCo.buy(new Dog());
        petCo.buy(new Dog());
        petCo.buy(new Dog());
        petCo.getInventory();

        System.out.println();
        System.out.println("Funds " + petCo.getFund());
        System.out.println();

        petCo.buy(new Dog());
        petCo.buy(new Dog());



        petCo.buy(new Cat());
        petCo.buy(new Dog());
        petCo.buy(new Parrot());

        petCo.sell(new Dog());
        petCo.sell(new Dog());
        petCo.sell(new Dog());
        petCo.sell(new Dog());
        petCo.sell(new Dog());
        petCo.sell(new Dog());
        petCo.sell(new Dog());
        petCo.sell(new Dog());
        petCo.sell(new Dog());







    }
}
