/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.petrolpumpapp;
import java.util.Scanner;
/**
 *
 * @author atefehhosseini
 */
public class PetrolPumpApp {

    public static void main(String[] args) {
        
        double amount;
        double cost;
       //petrol pump Object
       PetrolPump pump= new PetrolPump(20000,"Enleaded");
       //you can set amount of varibles with overloaded method or set method.
       pump.setMinimumQuantity(2);
       pump.setPricePerLitre(0.75);
       
       //Ask customer for amount of petrol to purchase
       Scanner console= new Scanner (System.in);
       
       System.out.println("Enter amount of petrol to purchase (litres): ");
     amount=console.nextDouble();
     
     
       //Fill car from pump and show cost
       cost=pump.fillCarFromPump(amount);
       if (cost>0){
           System.out.println("Cost of fuel is:"+cost+"Euro");
           
       }
       //Add 1000 litres to pump and show litres in pump
       pump.addFuel(1000);
       System.out.println("Litres in pump after refill: "+pump.getLitresInPump());
       pump.subFuel(amount);
       System.out.println("Remain litres in pump after purchasing:  "+pump.getLitresInPump());
   
    }
}
