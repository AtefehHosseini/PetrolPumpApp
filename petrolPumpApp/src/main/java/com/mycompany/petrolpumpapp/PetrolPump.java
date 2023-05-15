/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.petrolpumpapp;

/**
 *
 * @author atefehhosseini
 */
public class PetrolPump {
     double pricePerLitre;
    double minimumQuantity;
    double litresInPump;
    String fuelType;
    
    //Defualt costructor
    public PetrolPump(){
        this.fuelType="";
        this.litresInPump=0;
        this.minimumQuantity=0;
        this.pricePerLitre=0;
    }
    
    
    //Overloaded constructor
    public PetrolPump(double litresInPump,String fuelType){
        this.fuelType=fuelType;
        this.litresInPump=litresInPump;
//        this.minimumQuantity=minimumQuantity;
//        this.pricePerLitre=pricePerLitre;
//        setMinimumQuantity(minimumQuantity);
        
        
    }
    
    //Method to add fuel to the pump.
    public void addFuel(double amount){
        this.litresInPump+=amount;
    }
    public void subFuel(double amount){
        this.litresInPump-=amount;
    }
    //Method to fill car from the pump and return cost of fuel
    public double fillCarFromPump(double amount){
        
        if (amount<this.minimumQuantity){
          System.out.println("Can not purchase less than the minimum quantity of"+this.minimumQuantity +" litres.");
            return 0;
        }
        else if(amount>this.litresInPump) {
            System.out.println("Insuffucient fuel in pump to complete purchase");

          return 0;  
        }
        else {
        double cost=amount*this.pricePerLitre;
        this.litresInPump-=amount;
        return cost;
        
        }
        
    }
    
    //Getter methods
    
    public double getPricePerlitre(){
        return pricePerLitre;
    }
    
    public double getLitresInPump(){
        return litresInPump;
    }
    public double getMinimumQuantity(){
        return minimumQuantity;
        
    }
    
    public String fuelType(){
        return fuelType;
        
    }
    
    //Seter Methods
    public void setPricePerLitre(double pricePerLitre){
        this.pricePerLitre=pricePerLitre;
    }
    
    public void setMinimumQuantity(double minimumQuantity){
        this.minimumQuantity=minimumQuantity;
    }
    public void setInfo(double minimumQuantity,double pricePerLitre){
        setPricePerLitre(pricePerLitre);
        setMinimumQuantity(minimumQuantity);
        
    }
}
