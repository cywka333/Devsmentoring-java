package pl.devsmentoring.java.TestOOP;


import static pl.devsmentoring.java.TestOOP.Tank.*;

public class Main {

        public static void main(String[] args) {


                Sphere sphere1 = new Sphere("Sphere 1", 10);
                Sphere sphere2 = new Sphere("Sphere 2", 20);
                Cuboid cuboid1 = new Cuboid("Cuboid 1", 15, 20, 25);
                Cuboid cuboid2 = new Cuboid("Cuboid 2", 10, 5, 15);
                Cylinder cylinder1 = new Cylinder("Cylinder 1", 10, 5);
                Cylinder cylinder2 = new Cylinder("Cylinder 2", 15, 10);


                tanks.add(sphere1);
                tanks.add(sphere2);
                tanks.add(cuboid1);
                tanks.add(cuboid2);
                tanks.add(cylinder1);
                tanks.add(cylinder2);


                sphere1.pourWater(5);
                cuboid1.pourWater(10);
                cylinder2.pourWater(20);
                cuboid1.pourWater(3);
                cuboid1.pourWater(2);

                System.out.println("Tank with the most water: " + findTankWithMostWater(tanks).getName());
                System.out.println("Tank with the most water filled: " + findTankWithMostWaterFilled(tanks).getName());
                System.out.println("Empty tanks: " + findEmptyTanks(tanks));

                sphere2.transferWater(sphere1, 5);
                cuboid2.transferWater(cuboid1, 5);
                cylinder1.transferWater(cylinder2, 10);
                cylinder1.transferWater(cylinder2, 10);
                cylinder1.transferWater(cylinder2, 10);

                System.out.println("Tank with the most water: " + findTankWithMostWater(tanks).getName());
                System.out.println("Tank with the most water filled: " + findTankWithMostWaterFilled(tanks).getName());
                System.out.println("Empty tanks: " + findEmptyTanks(tanks));


                System.out.println("Most operations of pouring water " + mostOperationsOfGivenType("pourWater").getName());
                System.out.println("Most failed operations: " + countFailedOperations().toString());
                System.out.println("Comparing to event list the water level is: " + checkState("Cuboid 1"));
        }
}
