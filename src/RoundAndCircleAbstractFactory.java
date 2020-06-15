/*
* Classname : RoundAndCircleAbstractFactory
*
* Created on 14 June 2020
*
* Copyright Alyona Sviridova NTU KhPI
*
* Module 2 "Programming patterns. Factory, Builder." task
* Develop for your class
* 1. Factory.
* 2. Abstract factory.
* 3. Create a class Student  - 25 fields.
* 4. Create a builder for the class Student
*/
public class RoundAndCircleAbstractFactory {

    /**
     * IGeometry create method check figure type and create figure
     * @param radius is radius of Round or Circle
     * @param angle is angle of Round or Circle
     * @param diameter is diameter of Circle
     * @param type is figure type
     */
    public static IGeometry create(double radius, double angle,
                                   double diameter, String type) {

        if (type.equals(Figure.ROUND))
            return new Round(radius, angle);
        if (type.equals(Figure.CIRCLE))
            return new Circle(radius, angle, diameter);
        else {
            return null;
        }
    }
}
