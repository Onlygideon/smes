package management_system.student;

import management_system.school.SchoolController;

public class StudentModel {
    private int id;
    private String name;
    private String department;
    private int feesPaid = 0;

    public void setId(int id) {
       this.id = id;
   }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void payFees(int fees) {
       this.feesPaid += fees;
       SchoolController.updateMoneyEarned(fees);
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getRemainingFees() {
        int totalFees = 200_000;
        return totalFees - feesPaid;
    }
}
