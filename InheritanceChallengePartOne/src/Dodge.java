public class Dodge extends Car
{
    private boolean gas;
    private boolean brake;
    private boolean stopped;
    private boolean parked;
    private int currentGear = 0;

    public Dodge(boolean automatic, boolean manual, int gears, boolean steering, boolean gas, boolean brake)
    {
        super(automatic, manual, gears, steering);
        this.gas = gas;
        this.brake = brake;
    }

    public void Left()
    {
        if (steering) System.out.println("Steering Left");
        else System.out.println("Steering Pump must of went out.. it is very hard to turn to the left.");
    }

    public void Right()
    {
        if (steering) System.out.println("Steering Right");
        else System.out.println("Steering Pump must of went out.. it is very hard to turn to the right.");
    }

    public void Gas()
    {

        if (gas && !parked) System.out.println("Accelerating..");
        else System.out.println("You ran out of gas!");
    }

    public void Brake()
    {
        if (brake && !parked) System.out.println("Slowing down..");

        if (currentGear == 1)
        {
            System.out.println("You have stopped the vehicle.");
            stopped = true;
        }

        if (!brake) System.out.println("Brake lines might have been cut.. not slowing down..");
    }

    public void ShiftUp()
    {
        parked = false;

        if (currentGear == gears) System.out.println("Cannot Shift Any Higher!");

        else
        {
            currentGear++;
            System.out.println("Shifting into gear " + currentGear);
        }
    }

    public void ShiftDown()
    {
        if (currentGear == 1) System.out.println("You are attempting to shift into Park! Please shift into Park by calling Dodge.Park()");
        else
        {
            currentGear--;
            System.out.println("Shifting into gear " + currentGear);
        }
    }

    public void Park()
    {
        if (stopped && currentGear == 1 || stopped && currentGear == -1)
        {
            parked = true;
            currentGear = 0;
            System.out.println("You have put the car into park!");
        }
        else if (currentGear > 1) System.out.println("Please shift down and stop your car before attempting to put it into park!");
        else if (currentGear == 0) System.out.println("You are already in park!");
    }

    public void Reverse()
    {
        if (currentGear == 0)
        {
            currentGear = -1;
            System.out.println("you have put the car in reverse!");
        }
    }
}
