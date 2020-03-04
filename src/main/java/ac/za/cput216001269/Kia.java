package ac.za.cput216001269;

import java.util.Random;

public class Kia extends Sedan
{
    private int atstartSpeed = 60;
    private String color;

    public Kia()
    {
        super("Purple", 120, 4);

    }

    public Kia(String color, int power, int seats)
    {
        super(color, power, seats);
    }

    @Override
    public int startSpeed()
    {
        int ss = new Random().nextInt(atstartSpeed);
        return ss;
    }

    public Kia(String color, int power, int seats, int startSpeed)
    {
        super(color, power, seats);
        this.atstartSpeed = startSpeed;
    }

    public int getStartSpeed()
    {
        return atstartSpeed;
    }

    public void setStartSpeed(int startSpeed)
    {
        this.atstartSpeed = startSpeed;
    }

}
