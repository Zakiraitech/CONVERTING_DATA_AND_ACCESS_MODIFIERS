public class Car {
    private double speedKph;
    private float fuelLevel;
    private int distanceTraveled;

    public void setSpeed(double speed) {
        this.speedKph = speed;
    }
    public void setFuelLevel(float fuel) {
        this.fuelLevel = fuel;
    }

    public void drive(int distance) {
        distanceTraveled += distance;
    }

    public double getSpeedMph() {
        return speedKph * 0.621371;
    }

    public int getDistanceKm() {
        return distanceTraveled / 1000;
    }

    public int calculateRemainingFuel(double distance) {
        double fuelConsumed = (distance / 1000) * 0.5;
        float remainingFuel = fuelLevel - (float) fuelConsumed;
        return (int) Math.max(remainingFuel, 0);
    }
}