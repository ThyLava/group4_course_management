package entity;

public class Enrollment {
    private int id;
    private String enroll_date;
    private Student student;
    private Classes classes;

    public Enrollment(){};

    public Enrollment(int id, String enroll_date, Student student, Classes classes) {
        this.id = id;
        this.enroll_date = enroll_date;
        this.student = student;
        this.classes = classes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEnroll_date() {
        return enroll_date;
    }

    public void setEnroll_date(String enroll_date) {
        this.enroll_date = enroll_date;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Classes getClasses() {
        return classes;
    }

    public void setClasses(Classes classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Enrollment{" +
                "id=" + id +
                ", enroll_date='" + enroll_date + '\'' +
                ", student=" + student +
                ", classes=" + classes +
                '}';
    }
}
