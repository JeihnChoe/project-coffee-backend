package shop.mtcoding.projectcoffeebackend.order.api;

import shop.mtcoding.projectcoffeebackend.order.item.Item;

import java.sql.Timestamp;

public class OrderRestResponse {

    public static class FindAllOrderDTO{

        int orderId; // 주문번호
        String productName; //제품명
        String size; // 사이즈
        private int quantity;// 수량
        private int totalAmount; //금액
        private int cupType; //개인컵여부

        private Timestamp paymentTime; //결제시간

        public FindAllOrderDTO(Item item) {
            this.orderId = item.getOrder().getId();
            this.productName = item.getOption().getProduct().getName();
            this.size = item.getOption().getSize().getSize();
            this.quantity = item.getQuantity();
            this.totalAmount = item.getTotalAmount();
            this.cupType = item.getCupType();
            this.paymentTime = item.getPaymentTime();
        }
    }




}
