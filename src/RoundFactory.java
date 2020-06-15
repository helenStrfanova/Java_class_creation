/*
* Classname : RoundFactory
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

public class RoundFactory {

    /**
     * Round create method check radius, angle and create round
     * @param radius is radius of Round
     * @param angle is angle of Round
     */
    public static Round  create(double radius, double angle) {

        if (radius > 0 && angle > 0) {
            return new Round(radius, angle);
        } else {
            return null;
        }
    }
}
