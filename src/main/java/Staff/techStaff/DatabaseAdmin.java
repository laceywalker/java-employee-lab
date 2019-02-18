package Staff.techStaff;
import Staff.Employee;

public class DatabaseAdmin extends Employee {

    public DatabaseAdmin(String name, int nationalInsurance, int salary) {
        super(name, nationalInsurance, salary);
    }

    @Override
    public int getSalary() {
        return super.getSalary();
    }

    @Override
    public int getNationalInsurance() {
        return super.getNationalInsurance();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public double raiseSalary(double amount) {
        return super.raiseSalary(amount);
    }

    @Override
    public double payBonus() {
        return super.payBonus();
    }


}
