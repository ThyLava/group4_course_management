package entity;

public class Classes {
    private int id;
    private String room_name;
    private String shift;
    private String start_date;
    private String start_time;
    private String end_date;
    private String end_time;
    private double total_price;
    private Course course;
    private Teacher teacher;

    public Classes(){};

    public Classes(int id, String room_name, String shift, String start_date, String start_time, String end_date, String end_time, double total_price, Course course, Teacher teacher) {
        this.id = id;
        this.room_name = room_name;
        this.shift = shift;
        this.start_date = start_date;
        this.start_time = start_time;
        this.end_date = end_date;
        this.end_time = end_time;
        this.total_price = total_price;
        this.course = course;
        this.teacher = teacher;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoom_name() {
        return room_name;
    }

    public void setRoom_name(String room_name) {
        this.room_name = room_name;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public double getTotal_price() {
        return total_price;
    }

    public void setTotal_price(double total_price) {
        this.total_price = total_price;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Class{" +
                "id=" + id +
                ", room_name='" + room_name + '\'' +
                ", shift='" + shift + '\'' +
                ", start_date='" + start_date + '\'' +
                ", start_time='" + start_time + '\'' +
                ", end_date='" + end_date + '\'' +
                ", end_time='" + end_time + '\'' +
                ", total_price=" + total_price +
                ", course=" + course +
                ", teacher=" + teacher +
                '}';
    }
}
