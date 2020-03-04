package ac.za.cput216001269;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class EncapsulationTest {
    Kia cerato;
    private String color;
    private int power;
    private int seats;

    @Before
    public void setUp() throws Exception
    {
        cerato = new Kia();
        cerato.setColor("Black");
        cerato.setPower(260);
        cerato.setSeats(6);
    }

    @Test
    public void test() throws NoSuchFieldException, IllegalAccessException {
        Field privateStringField = Kia.class.getDeclaredField("color");
        privateStringField.setAccessible(true);

        String fieldValue = (String) privateStringField.get(cerato);
        System.out.println("fieldValue = "+fieldValue);
    }

    @After
    public void tearDown() throws Exception
    {
    }
}