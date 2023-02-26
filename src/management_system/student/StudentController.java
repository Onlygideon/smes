package management_system.student;

public class StudentController {
    private final StudentModel model;
    private final StudentVIew view;

    public StudentController(StudentModel model, StudentVIew view) {
        this.model = model;
        this.view = view;
    }

    public void setId(int id) {
        model.setId(id);
    }

    public int getId() {
        return  model.getId();
    }

    public void setName(String name) {
        model.setName(name);
    }

    public String getName() {
        return model.getName();
    }

    public void setDepartment(String department) {
        model.setDepartment(department);
    }

    public String getDepartment() {
        return model.getDepartment();
    }

    public void payFees(int fees) {
        model.payFees(fees);
    }

    public int getFeesPaid() {
        return model.getFeesPaid();
    }

    public int getRemainingFees() { return model.getRemainingFees(); }

    public void showStuudent() {
        view.showStudent(getId(), getName(), getDepartment(), getFeesPaid(), getRemainingFees());
    }
}
