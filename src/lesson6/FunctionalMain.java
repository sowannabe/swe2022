package lesson6;

public class FunctionalMain {
    static void main(String[] arg){
        Employee me = new Employee(2000), you = new Employee(5000);
        if(EmployeeTest.test(me,(me)->me.salary)>3000)
    }
}
