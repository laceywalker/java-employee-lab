import Staff.management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Meg", 45678, 50000, "pharma", 100);
    }

    @Test
    public void canHaveBudget(){
        assertEquals(100, director.getBudget(), 0.01);
    }

    @Test
    public void canDoubleBonus(){
        assertEquals(1000, director.payBonus(), 0.01);
    }

}
