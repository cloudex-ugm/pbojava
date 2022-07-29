import java.util.ArrayList;

public class EmployeeDataAccessLogic implements IEmployeeDataAccess {
    public Employee GetEmployeeDetails(int id){
        var dataEmployee = new ArrayList<Employee>();

        Employee employee1 = new Employee();
        employee1.ID = 1;
        employee1.Name = "John";
        employee1.Department = "DTETI";
        employee1.Salary = 1000000;

        Employee employee2 = new Employee();
        employee2.ID = 2;
        employee2.Name = "Susi";
        employee2.Department = "DTMI";
        employee2.Salary = 1200000;

        dataEmployee.add(employee1);
        dataEmployee.add(employee2);

        return dataEmployee.get(id - 1);
    }
}
