package management_system.lecturer;

public class LecturerController {
    private final LecturerModel model;

    public LecturerController(LecturerModel model) {
        this.model = model;
    }

    public void setId(int id) {
        model.setId(id);
    }

    public void setName(String name) {
        model.setName(name);
    }

    public void setDepartment(String department) {
        model.setDepartment(department);
    }

    public void receiveSalary(int salary) {
        model.receiveSalary(salary);
    }
}
