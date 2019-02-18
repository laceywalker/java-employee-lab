import Staff.techStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Harry Potatoes", 1234, 100);
    }

    @Test
    public void getName(){
        assertEquals("Harry Potatoes", databaseAdmin.getName());
    }

    @Test
    public void canGetNIN(){
        assertEquals(1234, databaseAdmin.getNationalInsurance());
    }

    @Test
    public void canGetSalary(){
        assertEquals(100, databaseAdmin.getSalary());
    }

}
