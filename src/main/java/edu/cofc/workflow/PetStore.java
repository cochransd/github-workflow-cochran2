package main.java.edu.cofc.workflow;

import java.util.ArrayList;

/**
 * Created by Steve Cochran PC on 1/24/2017.
 */
public class PetStore {

    ArrayList petInventory = new ArrayList<Animal>();

    Double storeFund;

    public PetStore(double money) {

        storeFund = money;

    }

    public void add(Animal Pet){

        petInventory.add(Pet);


    }

    public void buy(Animal pet){

        if ( (storeFund - pet.getPrice() <= 0) == false ) {

            storeFund = storeFund - pet.getPrice();
            petInventory.add(pet);

        }else{

            System.out.println("Sorry, not enough funds.");

        }

    }

    public void sell(Animal pet){

        if ( petInventory.indexOf(pet) != -1 ) {

            storeFund = storeFund + pet.getPrice() + 3.00;
            petInventory.remove( petInventory.indexOf(pet) );

        } else {

            System.out.println("Sorry, there are no more " + pet.getType() + "s to sell.");

        }

    }

    public double getFund(){

        return storeFund;

    }

    public void getInventory(){

        for( int i = 0; i < petInventory.size(); i++){

            Animal blank = (Animal)petInventory.get(i);

            System.out.println( "[" + i + "] " + "A: " + blank.getType() + ", C: " + blank.getColor() + ", P: " + blank.getPrice() );

        }


    }

}
