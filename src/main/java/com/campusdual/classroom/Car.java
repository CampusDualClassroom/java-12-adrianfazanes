package com.campusdual.classroom;

public class Car {
    public String brand;
    public String model;
    public static final int MAX_SPEED = 120;
    public String fuel;
    public int speedometer = 0;
    public int tachometer = 0;
    public String gear = "N";
    public boolean reverse = false;
    public int wheelsAngle = 0;

    public Car(String brand, String model, String fuel) {
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
    }

    public Car() {
    }

    public void start() {
        if (this.tachometer == 0) {
            this.tachometer = 1000;
            System.out.println("Vehículo encendido");
        } else {
            System.out.println("El vehículo ya está encendido");
        }
    }

    public void stop() {
        if (this.speedometer == 0) {
            this.tachometer = 0;
            System.out.println("Vehículo apagado");
        } else {
            System.out.println("No se puede apagar el vehículo, primero tiene que estar detenido");
        }
    }

    public void accelerate() {
        if (this.tachometer > 0 && this.speedometer < MAX_SPEED) {
            this.speedometer += 10;
            System.out.println("Acelerando. Velocidad actual: " + this.speedometer);
        } else {
            System.out.println("No se puede acelerar más, velocidad máxima alcanzada.");
        }
    }

    public void brake() {
        if (this.speedometer > 0) {
            this.speedometer -= 10;
            if (this.speedometer < 0) this.speedometer = 0;
            System.out.println("Frenando. Velocidad actual: " + this.speedometer);
        } else {
            System.out.println("El coche ya está detenido.");
        }
    }

    public void turnAngleOfWheels(int angle) {
        if (angle >= -45 && angle <= 45) {
            this.wheelsAngle = angle;
            System.out.println("Volante girado a: " + this.wheelsAngle + " grados");
        } else {
            System.out.println("No se puede girar el volante más de 45 grados.");

            if (angle < -45){
                this.wheelsAngle = -45;
            }else {
                this.wheelsAngle = 45;
            }


        }
    }

    public String showSteeringWheelDetail() {
        return "Ángulo de dirección: " + this.wheelsAngle;
    }

    public boolean isReverse() {
        return this.reverse;
    }

    public void setReverse(boolean reverse) {
        if (this.speedometer == 0) {
            this.reverse = reverse;
            this.gear = "R";
            System.out.println("Coche en marcha atrás.");
        } else {
            System.out.println("No se puede poner marcha atrás mientras el coche está en movimiento.");
        }
    }

    public boolean isTachometerEqualToZero() {
        return this.tachometer == 0;
    }

    public boolean isTachometerGreaterThanZero() {
        return this.tachometer > 0;
    }

    public void showDetails() {
        System.out.println("Marca: " + this.brand + ", Modelo: " + this.model + ", Combustible: " + this.fuel +
                ", Velocidad: " + this.speedometer + ", Tacómetro: " + this.tachometer +
                ", Marcha: " + this.gear);
    }

    public boolean isTachometerZero() {
        return this.tachometer == 0;
    }

    public static void main(String[] args) {

    }
}
