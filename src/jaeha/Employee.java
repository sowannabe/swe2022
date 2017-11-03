package jaeha;

public class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary){
        this.name= name;
        this.salary=salary;

    }
    public void raiseSalary(double byPercent){
        double raise= this.salary*byPercent/100;
        this.salary+=raise;
    }
    public String getName(){
        return this.name;
    }

    public static void main(String[] args){
        Employee employee = new Employee("fred",5000);
        employee.getName();
        
    }
}
