package z_26_inventory_management_system;

import java.util.Map;

public class Order {

    User user;
    Address deliveryAddress;
    Map<Integer, Integer> productCategoryAndCountMap;
    WareHouse wareHouse;
    Invoice invoice;
    Payment payment;
    OrderStatus orderStatus;

    Order(User user, WareHouse wareHouse) {
        this.user = user;
        this.wareHouse = wareHouse;
        this.deliveryAddress = user.address;
        invoice = new Invoice();
        invoice.generateInvoice(this);
        this.productCategoryAndCountMap = user.getUserCart().getCartItems();
    }

    public void checkOut() {
        wareHouse.removeItemFromInventory(productCategoryAndCountMap);
        boolean isPaymentSuccess = makePayment(new UPIPaymentMode());

        if (isPaymentSuccess) {
            user.userCartDetails.emptyCart();;
        } else {
            wareHouse.addItemToInventory(productCategoryAndCountMap) ;
        }
    }

    public boolean makePayment(PaymentMode paymentMode){
        payment = new Payment(paymentMode);
        return payment.makePayment();
    }

    public void generateOrderInvoice(){
        invoice.generateInvoice(this);
    }


}
