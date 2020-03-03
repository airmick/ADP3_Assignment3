package ac.za.cput216001269;

public class Vehicle {
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

    public void setColor(String color)
    {
        this.color = color;
    }

    public int getPower()
    {
        return power;
    }

    public void setPower(int power)
    {
        this.power = power;
    }

    public int getSeats()
    {
        return seats;
    }

    public void setSeats(int seats)
    {
        this.seats = seats;
    }
}
