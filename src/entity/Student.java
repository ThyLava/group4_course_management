package entity;

public class Student {
    private int id;
    private String full_name;
    private int phone;

    public Student(){};

    public Student(int id, String full_name, int phone) {
        this.id = id;
        this.full_name = full_name;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", full_name='" + full_name + '\'' +
                ", phone=" + phone +
                '}';
    }
}
