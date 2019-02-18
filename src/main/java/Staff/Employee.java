package Staff;

public abstract class Employee {

    private String name;
    private int nationalInsurance;
    private int salary;

    public Employee(String name, int nationalInsurance, int salary){
        this.name = name;
        this.nationalInsurance = nationalInsurance;
        this.salary = salary;
    }

    public int getSalary() {
        return this.salary;
    }

    public int getNationalInsurance() {
        return this.nationalInsurance;
    }

    public String getName() {
        return this.name;
    }

    public double raiseSalary(double amount){
        double newSalary = this.salary * amount;
        return this.salary;
    }

    public double payBonus(){
        double payBonus = this.salary * 0.01;
        return this.salary + payBonus;
    }
}
