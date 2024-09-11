public class Main {
    public static void main(String[] args) {

        Car regularCar = new Car();
        ElectricCar electricCar = new ElectricCar();
        regularCar.setSpeed(100.0);
        regularCar.setFuelLevel(50.0f);
        electricCar.setSpeed(80.0);
        electricCar.setFuelLevel(75.0f);
        electricCar.setBatteryLevel(80.0);
        regularCar.drive(5000);
        electricCar.drive(20000);

        System.out.println("Regular Car Speed (mph): " + regularCar.getSpeedMph());
        System.out.println("Regular Car Distance (km): " + regularCar.getDistanceKm());
        System.out.println("Regular Car Remaining Fuel (%): " + regularCar.calculateRemainingFuel(5));
        System.out.println("Electric Car Speed (mph): " + electricCar.getSpeedMph());
        System.out.println("Electric Car Distance (km): " + electricCar.getDistanceKm());
        System.out.println("Electric Car Remaining Fuel (%): " + electricCar.calculateRemainingFuel(20));
        System.out.println("Electric Car Remaining Battery Level (%): " + electricCar.getBatteryLevel());

    }

}
