package day48_overriding;

public class EmployeeTEST {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.calculatePay(40, 65);

        Contructor contructor = new Contructor();
        contructor.calculatePay(40,70);

        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee();
        fullTimeEmployee.calculatePay(40, 65);




    }
}
