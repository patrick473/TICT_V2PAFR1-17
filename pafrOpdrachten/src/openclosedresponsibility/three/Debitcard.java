package openclosedresponsibility.three;

/**
 * Created by patrick on 11/16/2017.
 */
public class Debitcard extends Payment {

    public Debitcard() {

    }
    public Debitcard(double total) {
        super(total);
    }
    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        super.total = total;
    }

    @Override
    public String toString() {
        return "Debitcard{"+super.total+"}";
    }
}
