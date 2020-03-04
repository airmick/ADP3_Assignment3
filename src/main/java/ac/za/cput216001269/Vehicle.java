package ac.za.cput216001269;

public class Vehicle
{
    private String color;
    private int power;
    private int seats;

    public Vehicle(String color, int power, int seats)
    {
        this.color = color;
        this.power = power;
        this.seats = seats;
    }

    public String getColor()
    {
        return color;
    }

    public String setColor(String color)
    {
        this.color = color;
        return color;
    }

    public int getPower()
    {
        return power;
    }

    public int setPower(int power)
    {
        this.power = power;
        return power;
    }

    public int getSeats()
    {
        return seats;
    }

    public int setSeats(int seats)
    {
        this.seats = seats;
        return seats;
    }
}
