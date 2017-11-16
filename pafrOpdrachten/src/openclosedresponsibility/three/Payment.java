package openclosedresponsibility.three;

/**
 * Created by patrick on 11/16/2017.
 */
public abstract class Payment {
        double total;

    public Payment() {
    }

    public Payment(double total) {
        this.total = total;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "total=" + total +
                '}';
    }
}
