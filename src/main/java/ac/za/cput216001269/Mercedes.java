package ac.za.cput216001269;

import java.util.Random;

public class Mercedes extends Sedan {
    private int atstartSpeed = 10;

    public Mercedes(String color, int power, int seats)
    {
        super(color, power, seats);
    }

    public Mercedes(String color, int power, int seats, int atstartSpeed)
    {
        super(color, power, seats);
        this.atstartSpeed = atstartSpeed;
    }

    @Override
    public int startSpeed()
    {
        int ss = new Random().nextInt(atstartSpeed);
        return ss;
    }

    public int getAtstartSpeed()
    {
        return atstartSpeed;
    }

    public void setAtstartSpeed(int atstartSpeed)
    {
        this.atstartSpeed = atstartSpeed;
    }
}
