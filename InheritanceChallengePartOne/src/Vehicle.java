public class Vehicle
{
    private boolean automatic;
    private boolean manual;

    public Vehicle(boolean automatic, boolean manual)
    {
        if (automatic) manual = false;
        if (manual) automatic = false;

        this.automatic = automatic;
        this.manual = manual;
    }
}
