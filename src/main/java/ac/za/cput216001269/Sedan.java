package ac.za.cput216001269;

public abstract class Sedan extends Vehicle{

    public Sedan(String color, int power, int seats)
    {
        super(color, power, seats);
    }

    public  abstract int startSpeed();
}
