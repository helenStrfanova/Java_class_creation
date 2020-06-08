/*
* Classname : Circle
*
* Created on 07 June 2020
*
* Copyright Alyona Sviridova NTU KhPI
*
* Module 2 "Inheritance" task
*
* Create another class as a super class for your one.  Or create a daughterly class for your one.
* */

//Create a daughterly class for Round
public class Circle extends Round {

    private double diameter;

    /*
    * Constructor with 3 parameters
    * */
    public Circle(double radius, double angle, double diameter) {
        super(radius, angle);
        this.diameter = diameter;
    }

    /*
    * Getters for diameter field
    * */
    public double getDiameter() {
        return diameter;
    }

    /*
    * Setters for diameter field
    * */
    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    /*
    * Method for getting chord length of a circle
    * */
    public double getChordLength() {
        return  this.getDiameter() * Math.sin(super.getAngle() / 2);
    }

    /*
    * Method for getting length of a circle
    * */
    public double getCircleLength() {
        return this.getDiameter() * Math.PI;
    }

    /*
    * Method for getting arc length of a circle
    * */
    @Override
    public double getArcLength() {
        return this.getAngle() * (this.getDiameter() / 2);
    }

    /*
    * Override toString() method for circle daughterly class
    **/
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + super.getRadius() +
                ", angle=" + super.getAngle() +
                ", diameter=" + this.getDiameter() +
                ", length=" + this.getCircleLength() +
                ", arc length=" + this.getArcLength() +
                ", chord length=" + this.getChordLength() +
                '}';
    }

}
