package openclosedresponsibility.three;

/**
 * Created by patrick on 11/16/2017.
 */
public class Cash extends  Payment {

        public Cash() {

        }
        public Cash(double total) {
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
            return "Cash{"+super.total+"}";
        }
    }