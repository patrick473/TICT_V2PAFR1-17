package openclosedresponsibility.three;

/**
 * Created by patrick on 11/16/2017.
 */
public class cashHander {
    public cashHander() {
    }

    public void checkout(Receipt receipt, Payment p){
        p.setTotal( receipt.getTotal());
        receipt.setPayment(p);
        System.out.println(receipt.toString());
    }
}
