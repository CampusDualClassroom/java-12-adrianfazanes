package com.campusdual.classroom;

public class Exercise12 {
    public static void main(String[] args) {
        Car myCar = new Car("Ford", "Mustang", "Gasolina");

        System.out.println("Verificar si el tacómetro es cero: " + myCar.isTachometerZero());
        myCar.start();
        System.out.println("Verificar si el tacómetro es cero después de encender: " + myCar.isTachometerZero());
        myCar.start();
        myCar.accelerate();
        myCar.accelerate();
        myCar.brake();
        myCar.stop();
        myCar.stop();
        myCar.accelerate();
        myCar.turnAngleOfWheels(45);
        myCar.turnAngleOfWheels(-50);
        myCar.setReverse(true);
        myCar.accelerate();
        myCar.accelerate();
        myCar.setReverse(false);
    }
}
