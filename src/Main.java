/*
* Classname : Main
*
* Created on 06 June 2020
*
* Copyright Alyona Sviridova NTU KhPI
*
* */
public class Main {

    public static void main(String[] args) {

        Round round1 = new Round(14, 2.5);
        System.out.println(round1.toString());
        System.out.println(round1.hashCode());
        System.out.println(round1.equals(round1));

        Circle circle1 = new Circle(5,15, 10);
        System.out.println(circle1.toString());
    }
}
