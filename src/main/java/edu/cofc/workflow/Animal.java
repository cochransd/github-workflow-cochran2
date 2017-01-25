package main.java.edu.cofc.workflow;

import java.util.Random;

/**
 * Created by Steve Cochran PC on 1/24/2017.
 */
public class Animal {

    double price;
    String color;
    String type;

    public Animal(){

        price = 0;
        Random rand = new Random();
        int rcolor = rand.nextInt(3);
        if (rcolor == 0){
            color = "Brown";
        }
        if (rcolor == 1){
            color = "Dark Brown";
        }
        if (rcolor == 2){
            color = "Grey";
        }

    }

    public String getColor(){

        return color;

    }

    public double getPrice(){

        return price;

    }

    public String getType(){

        return type;

    }


}
