package entity;

public class Student {
    private int id;
    private String full_name;
    private long phone;
    public Student(){};

    public Student(int id, String full_name, long phone) {
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

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
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
