/*
* Classname : Rectangle
*
* Created on 07 June 2020
*
* Copyright Alyona Sviridova NTU KhPI
*
* Module 2 "Create a child  from the class Rectangle" task
*/

package Inheritance_of_rectangle;

public class Rectangle {

    private int id;
    private int length;
    private int width;
    public final double PI = 3.14;

    /*
    * Constructor with 3 parameters
    * */
    public Rectangle(int id, int length, int width) {
        this.id = id;
        this.length = length;
        this.width = width;
    }

    /*
    * Getters for "id", "length" and "width" class fields
    * */
    public int getId() {
        return id;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    /*
    * Setters for "id", "length" and "width" class fields
    * */
    public void setId(int id) {
        this.id = id;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    /*
    * Method for getting area of a rectangle
    * */
    public static int getArea(int length, int width) {
        return length * width;
    }

    /*
    * Method for checking rectangle as quadrat
    * */
    public boolean isQuadrat() {
        return false;
    }

    /*
    * Override equals(Object o) method
    * */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return getId() == rectangle.getId();
    }

    /*
    * Override toString() method
    * */
    @Override
    public String toString() {
        return "Rectangle{" +
                "id = " + id +
                ", length = " + length +
                ", width = " + width +
                '}';
    }

    /*
    * Override hashCode() method
    * */
    @Override
    public int hashCode() {
        return id;
    }
}
