package management_system.school;

import management_system.lecturer.LecturerController;
import management_system.student.StudentController;

public class SchoolController {
    private final SchoolModel model;

    public SchoolController(SchoolModel model) {
        this.model = model;
    }

    public void addLecturer(LecturerController lecturer) {
        model.addLecturer(lecturer);
    }

    public void addStudent(StudentController student) {
        model.addStudent(student);
    }

    public static void updateMoneyEarned(int money) {
        SchoolModel.updateMoneyEarned(money);
    }

    public static void spendMoneyEarned(int money) { SchoolModel.spendMoneyEarned(money); }

    public static void updateMoneySpent(int money) {
        SchoolModel.updateMoneySpent(money);
    }
}
