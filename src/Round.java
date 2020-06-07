/*
* Classname : Round
*
* Created on 06 June 2020
*
* Copyright Alyona Sviridova NTU KhPI
*
* Module 2 "Java class creation" task
*
* Create a class from the attached document according to the order in your group .  The class must contain
* 1. Constructor.
* 2. Getters/Setters.
* 3. 5 methods.
* 4. Override toString() method
* 5. Override hash() and equals() methods.
* */

import java.util.Objects;

public class Round {

    private double radius;
    private double angle;

    /*
    * 1. Constructor with 2 parameters
    * */

    public Round(double radius, double angle) {
        this.radius = radius;
        this.angle = angle;
    }

    /*
    * 2.1 Getters for all class fields
    * */

    public double getRadius() {
        return radius;
    }

    public double getAngle() {
        return angle;
    }

    /*
    * 2.2 Setters for all class fields
    * */

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }

    /*
    * 3.1 Method for getting perimeter of a round
    * */

    public double getPerimeter() {
        return 2 * Math.PI * this.getRadius();
    }

    /*
    * 3.2 Method for getting area of a round
    * */

    public double getArea() {
        return Math.PI * Math.pow(this.getRadius(), 2);
    }

    /*
    * 3.3 Method for getting sector area of a round
    * */

    public double getSectorArea() {
        return (this.getAngle() * Math.pow(this.getRadius(), 2)) / 2;
    }

    /*
    * 3.4 Method for getting segment area of a round
    * */

    public double getSegmentArea() {
        return ((this.getAngle() - Math.sin(this.getAngle()))
                * Math.pow(this.getRadius(), 2)) / 2;
    }

    /*
    * 3.5 Method for getting sector arc length of a round
    * */

    public double getArcLength() {

        return this.getAngle() * this.getRadius();
    }

    /*
    * 4. Override toString() method
    * */

    @Override
    public String toString() {
        return "Round{" +
                "radius=" + radius +
                ", angle=" + angle +
                ", area=" + this.getArea() +
                ", perimeter=" + this.getPerimeter() +
                ", arc length=" + this.getArcLength() +
                ", segment area=" + this.getSegmentArea() +
                ", sector area=" + this.getSectorArea() +
                '}';
    }

    /*
    * 5.1 Override hash() method.
    * */

    @Override
    public int hashCode() {
        return Objects.hash(getAngle(), getRadius());
    }

    /*
    * 5.2 Override equals() method.
    * */

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Round round = (Round) obj;
        return getRadius() == round.getRadius() &&
                Double.compare(round.getAngle(), getAngle()) == 0;
    }
}
