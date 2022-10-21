package entity;

public class Payment {
    private int id;
    private double price;
    private String payment_date;
    private Enrollment enrollment;

    public Payment(){};

    public Payment(int id, double price, String payment_date, Enrollment enrollment) {
        this.id = id;
        this.price = price;
        this.payment_date = payment_date;
        this.enrollment = enrollment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPayment_date() {
        return payment_date;
    }

    public void setPayment_date(String payment_date) {
        this.payment_date = payment_date;
    }

    public Enrollment getEnrollment() {
        return enrollment;
    }

    public void setEnrollment(Enrollment enrollment) {
        this.enrollment = enrollment;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", price=" + price +
                ", payment_date='" + payment_date + '\'' +
                ", enrollment=" + enrollment +
                '}';
    }
}
