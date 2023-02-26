package management_system.student;

public class StudentVIew {
    public void showStudent(int id, String name, String department, int feesPaid, int remainingFees) {
        System.out.println("Student id: " + id);
        System.out.println("Student name: " + name);
        System.out.println("Student department: " + department);
        System.out.println("Student paid fees: " + feesPaid);
        System.out.println("Student remaining fees: " + remainingFees);
    }
}
