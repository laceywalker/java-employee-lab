package Staff.management;

public class Director extends Manager {

    private double budget;

    public Director(String name, int nationalInsurance, int salary, String deptName, double budget) {
        super(name, nationalInsurance, salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    @Override
    public double payBonus(){
        return super.getSalary() * 0.02;
    }


}
