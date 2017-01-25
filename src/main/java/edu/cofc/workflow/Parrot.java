package main.java.edu.cofc.workflow;

/**
 * Created by Steve Cochran PC on 1/24/2017.
 */
public class Parrot extends Animal{

    public Parrot(){

        type = "Parrot";

        price = 7.00;

        if (color == "Brown"){
            color = "Red";
        }
        if (color == "Dark Brown"){
            color = "Green";
        }
        if (color == "Grey"){
            color = "Yellow";
        }

    }

}
