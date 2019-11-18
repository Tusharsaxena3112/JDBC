package databaseHelper;

import employee.Employee;

public class EmployeeCRUD {
    private Employee employee;

    public Employee createEmployee(int employee_Id, double employeeSalary, String employeeName) {
        return employee = new Employee(employeeName, employee_Id, employeeSalary);
    }

    //READ part.........
    public int getEmployeeID() {
        return employee.getEmployeeId();
    }

    public String getEmployeeName() {
        return employee.getEmployeeName();
    }

    public double getEmployeeSalary() {
        return employee.getEmployeeSalary();
    }

    //UPDATE part......

}
