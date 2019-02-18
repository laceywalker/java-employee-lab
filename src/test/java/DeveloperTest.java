import Staff.techStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Jim Jones", 1234, 10000);
    }

    @Test
    public void canGetName(){
        assertEquals("Jim Jones", developer.getName());
    }

    @Test
    public void canGetNationalInsuranceNumber(){
        assertEquals(1234, developer.getNationalInsurance());
    }

    @Test
    public void canGetSalary(){
        assertEquals(10000, developer.getSalary());
    }


    @Test
    public void canRaiseSalary(){
        double newSalary = developer.raiseSalary(10.0);
        assertEquals(100000, newSalary, 0.01);
    }

    @Test
    public void canGetBonus(){
        assertEquals(100, developer.payBonus(), 0.01);
    }
}
