package openclosedresponsibility.three;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by patrick on 11/16/2017.
 */
public class Receipt {

    List<Item> items = new ArrayList<>();
    Payment payment;

    public Receipt() {
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public void addItem(Item item){
        this.items.add(item);
    }
    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "Receipt{" +
                "items=" + items +
                ", payment=" + payment +
                '}';
    }
    public double getTotal(){
        double total = 0;
       for (Item i : items){
           total += i.getPrice();
       }
       return total;
    }
}
