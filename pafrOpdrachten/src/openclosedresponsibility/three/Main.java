package openclosedresponsibility.three;

/**
 * Created by patrick on 11/16/2017.
 */
public class Main {
    public static void main(String[] args){
    cashHander ch = new cashHander();
    Item apple = new Item("apple",2.50);
    Item pear = new Item("pear",1.34);
    Item waterbottle = new Item("waterbottle",1);
    Receipt receipt = new Receipt();
    receipt.addItem(apple);
    receipt.addItem(pear);
    receipt.addItem(waterbottle);
    Payment pay = new Debitcard();
    Payment cash = new Cash();
    ch.checkout(receipt,pay);
    ch.checkout(receipt,cash);


    }

}
