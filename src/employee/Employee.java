package employee;

public class Employee{
    public String employeeName;
    public int employee_id;
    private double employeeSalary;

    public Employee() {
        this.employeeSalary = 100_00_00;
        this.employee_id = 0;
        this.employeeName = "Fluffy";
    }
     public Employee(String employeeName, int employee_id ,double employeeSalary){
         this.employee_id =employee_id;
         this.employeeName =employeeName;
         this.employeeSalary =employeeSalary;
     }

     public void setEmployeeName(String employeeName){
         this.employeeName =employeeName;
     }

     public void setEmployee_id(int employee_id){
         this.employee_id =employee_id;
     }

    public void setEmployeeSalary(int employeeSalary){
        this.employeeSalary =employeeSalary;
    }

    public String getEmployeeName(){
         return employeeName;
    }


    public int getEmployee_id(){
        return employee_id;
    }


    public double getEmployeeSalary(){
        return employeeSalary;
    }

    public String toString() {
        return String.format("Employee Name :%s\n Employee ID : %d \n Employee Salary : %f", getEmployeeName(), getEmployee_id(), getEmployeeSalary());
    }


}
