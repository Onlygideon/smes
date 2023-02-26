package management_system.lecturer;

import management_system.school.SchoolController;

public class LecturerModel {
    private int id;
    private String name;
    private String department;
    private int salary;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void receiveSalary(int salary) {
        this.salary = salary;
        SchoolController.spendMoneyEarned(salary);
        SchoolController.updateMoneySpent(salary);
    }
}
