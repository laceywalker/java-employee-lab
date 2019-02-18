import Staff.management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Tom Spaghetti", 23658, 250000, "robotic");
    }

    @Test
    public void canGetName(){
        assertEquals("Tom Spaghetti", manager.getName());
    }

    @Test
    public void canGetNInumber(){
        assertEquals(23658, manager.getNationalInsurance());
    }

    @Test
    public void canGetSalary(){
       assertEquals(250000, manager.getSalary());
    }

    @Test
    public void canGetDeptName(){
        assertEquals("robotic", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        double newSalary = manager.raiseSalary(15.0);
        assertEquals(3750000, newSalary, 0.01);
    }

    @Test
    public void canGetBonus(){
        assertEquals(2500, manager.payBonus(), 0.01);
    }

    @Test
    public void cantGiveNegativeRaise(){
        manager.raiseSalary(-10);
        assertEquals(250000, manager.getSalary());
    }

    @Test
    public void canChangeName(){
        manager.setName("Tony");
        assertEquals("Tony", manager.getName());
    }

    @Test
    public void cantChangeNullName(){
        manager.setName(null);
        assertEquals("Tom Spaghetti", manager.getName());
    }



}
