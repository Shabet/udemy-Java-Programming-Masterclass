package ch07.ClassesPart1;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
//        car.setMake("Porsche");
        car.setMake("Maserati");
        car.setModel("Carrera");
        car.setDoors(2);
        car.setConvertible(true);
        car.setColor("block");
        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());
        car.describeCar();
    }
}
