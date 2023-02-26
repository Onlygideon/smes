package management_system.school;

import management_system.lecturer.LecturerController;
import management_system.student.StudentController;

import java.util.ArrayList;
import java.util.List;

public class SchoolModel {
    private final List<LecturerController> lecturers = new ArrayList<>();
    private final List<StudentController> students = new ArrayList<>();
    private static int totalMoneyEarned = 0;
    private static int totalMoneySpent = 0;

    public List<LecturerController> getLecturers() {
        return lecturers;
    }

    public void addLecturer(LecturerController lecturer) {
        this.lecturers.add(lecturer);
    }

    public List<StudentController> getStudents() {
        return students;
    }

    public void addStudent(StudentController student) {
        this.students.add(student);
    }

    public int getMoneyEarned() {
        return totalMoneyEarned;
    }

    public static void updateMoneyEarned(int money) {
        totalMoneyEarned += money;
    }

    public static void spendMoneyEarned(int money) {
        totalMoneyEarned -= money;
    }

    public int getMoneySpent() {
        return totalMoneySpent;
    }

    public static void updateMoneySpent(int moneySpent) {
        totalMoneySpent += moneySpent;
    }
}
