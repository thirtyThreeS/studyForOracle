public class Car extends Vehicle
{
    public int gears;
    public boolean steering;

    public Car(boolean automatic, boolean manual, int gears, boolean steering) {
        super(automatic, manual);
        this.gears = gears;
        this.steering = steering;
    }
}
