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
    public void setEmployeeID(int employee_id) {
        this.employee.setEmployee_id(employee_id);
    }

    public void setEmployeeName(String employeeName) {
        this.employee.setEmployeeName(employeeName);
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employee.setEmployeeSalary(employeeSalary);
    }
}
