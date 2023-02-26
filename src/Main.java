import management_system.lecturer.LecturerController;
import management_system.lecturer.LecturerModel;
import management_system.school.SchoolController;
import management_system.school.SchoolModel;
import management_system.student.StudentController;
import management_system.student.StudentModel;
import management_system.student.StudentVIew;

public class Main {
    public static void main(String[] args) {
        LecturerModel lecturerModel = new LecturerModel();
        StudentModel studentModel = new StudentModel();
        SchoolModel schoolModel = new SchoolModel();

        StudentVIew studentVIew = new StudentVIew();

        // create new lecturer
        LecturerController lecturer = new LecturerController(lecturerModel);
        lecturer.setName("joe harris");
        lecturer.setId(1);
        lecturer.setDepartment("cyber security");
        lecturer.receiveSalary(70_000);

        // create new student
        StudentController student = new StudentController(studentModel, studentVIew);
        student.setName("tobias john");
        student.setId(1);
        student.setDepartment("cyber security");
        student.payFees(130_000);
        student.payFees(10_000);

        // create a new school
        SchoolController school = new SchoolController(schoolModel);
        school.addLecturer(lecturer);
        school.addStudent(student);

        student.showStuudent();
    }
}