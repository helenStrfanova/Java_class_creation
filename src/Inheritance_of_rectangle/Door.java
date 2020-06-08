/*
* Classname : Door
*
* Created on 07 June 2020
*
* Copyright Alyona Sviridova NTU KhPI
*
* Module 2 "Create a child  from the class Inheritance_of_rectangle.Rectangle" task
*/

package Inheritance_of_rectangle;

public class Door extends Rectangle {

    private String colour;
    private int doorLocksAmount;
    private boolean peephole;
    private String material;
    private double doorLockPrise;
    private double peepholePrice;

    /*
    * Constructor with 9 parameters
    * */
    public Door(int id, int length, int width, String colour,
                int doorLocksAmount, boolean peephole, String material,
                double doorLockPrise, double peepholePrice) {

        super(id, length, width);
        this.colour = colour;
        this.doorLocksAmount = doorLocksAmount;
        this.peephole = peephole;
        this.material = material;
        this.doorLockPrise = doorLockPrise;
        this.peepholePrice = peepholePrice;
    }

    /*
    * Getters for all class fields
    * */
    public String getColour() {
        return colour;
    }

    public int getDoorLocksAmount() {
        return doorLocksAmount;
    }

    public boolean isPeephole() {
        return peephole;
    }

    public String getMaterial() {
        return material;
    }

    public double getDoorLockPrise() {
        return doorLockPrise;
    }

    public double getPeepholePrice() {
        return peepholePrice;
    }

    /*
    * Setters for all class fields
    * */
    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setDoorLocksAmount(int doorLocksAmount) {
        this.doorLocksAmount = doorLocksAmount;
    }

    public void setPeephole(boolean peephole) {
        this.peephole = peephole;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setDoorLockPrise(double doorLockPrise) {
        this.doorLockPrise = doorLockPrise;
    }

    public void setPeepholePrice(double peepholePrice) {
        this.peepholePrice = peepholePrice;
    }

    /*
    * Method for getting peephole prise
    * */
    public double getPriseForPeephole(){

        if(this.peephole == true) {
            return 1 * this.peepholePrice;
        }else {
            return 0;
        }
    }

    /*
    * Method for getting door locks prise
    * */
    public double getPriseForDoorLocks(){

        return this.doorLocksAmount * this.doorLockPrise;
    }

    /*
    * Method for getting door area
    * */
    public double getDoorArea(){
        return super.getLength() * super.getWidth();
    }

    /*
    * Override methods for getting door length and width
    * */
    @Override
    public int getLength() {
        return super.getLength();
    }

    @Override
    public int getWidth() {
        return super.getWidth();
    }
}
