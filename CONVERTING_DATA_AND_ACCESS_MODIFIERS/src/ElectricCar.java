public class ElectricCar extends Car {
    private double batteryLevel;

    public void setBatteryLevel(double battery) {
        this.batteryLevel = battery;
    }
    public double getBatteryLevel() {
        return batteryLevel;
    }
    @Override
    public void drive(int distance) {
        super.drive(distance);
        int distanceKm = getDistanceKm();
        if (distanceKm > 0) {
            batteryLevel -= (distanceKm / 10);
        }
        batteryLevel = Math.max(batteryLevel, 0);
    }
}