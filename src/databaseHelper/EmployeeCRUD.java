package databaseHelper;

import employee.Employee;

public class EmployeeCRUD {
    private Employee employee;

    public Employee createEmployee(int employee_Id, double employeeSalary, String employeeName) {
        return employee = new Employee(employeeName, employee_Id, employeeSalary);
    }

    public int getEmployeeID() {
        return employee.getEmployeeId();
    }

}
