package ac.za.cput216001269;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InheritanceTest {
    Mercedes benz;
    private String color;
    private int power;
    private int seats;

    @Before
    public void setUp() throws Exception {
        benz = new Mercedes("blue", 160, 2);
    }

    @Test
    public void test()
    {
        String color = benz.setColor("Red");
        int p = benz.setPower(120);
        int myseats = benz.setSeats(4);

        Assert.assertEquals(this.benz.getColor(), color);
        Assert.assertEquals(this.benz.getPower(), p);
        Assert.assertEquals(this.benz.getSeats(), myseats);
    }

    @After
    public void tearDown() throws Exception {
    }
}