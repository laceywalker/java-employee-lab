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

    public void setName(String name){
        if (name != null){
            this.name = name;
        }
//        else{
//            this.name = this.name;}
    }

    public double raiseSalary(double amount) {
        double newSalary = 0;
        double returnedSalary = this.salary;

        if (amount <= 0) {
            return returnedSalary; }
            else {
            newSalary = this.salary * amount;
        }
        return newSalary;
    }

    public double payBonus(){
        return this.salary * 0.01;
    }
}
