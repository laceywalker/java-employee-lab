package Staff.management;

import Staff.Employee;

public class Manager extends Employee {

    private String deptName;

    public Manager(String name, int nationalInsurance, int salary, String deptName) {
        super(name, nationalInsurance, salary);
        this.deptName = deptName;
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

    public String getDeptName(){
        return this.deptName;
    }
}
