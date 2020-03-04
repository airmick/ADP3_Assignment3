package ac.za.cput216001269;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PolimorphismTest {
    Kia picanto;
    Kia cerato;

    @Before
    public void setUp() throws Exception
    {
        picanto = new Kia("Black", 180, 6);
        cerato = new Kia("White", 240, 4);
    }

    @Test
    public void test()
    {
        assertEquals(true, picanto != null);
        assertTrue(cerato instanceof Vehicle);
        assertTrue(picanto instanceof Vehicle);
    }

    @After
    public void tearDown() throws Exception
    {
    }
}