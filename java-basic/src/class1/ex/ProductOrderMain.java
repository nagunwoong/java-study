package class1.ex;

public class ProductOrderMain {

    public static void main(String[] args) {

        ProductOrder order = new ProductOrder();

        order.productName = "수박";
        order.price = 3000;
        order.quantity = 3;

        ProductOrder order1 = new ProductOrder();

        order1.productName = "토마토";
        order1.price = 8000;
        order1.quantity = 1;

        ProductOrder order2 = new ProductOrder();

        order2.productName = "사과";
        order2.price = 5000;
        order2.quantity = 2;


        ProductOrder[] orders = {order, order1, order2};

        int  sum = 0;
        for (ProductOrder productOrder : orders) {
            System.out.println("상품명 : " + productOrder.productName + " , " + " 가격 : " + productOrder.price + " , " + " 수량 " + productOrder.quantity);
            sum += productOrder.price * productOrder.quantity;
        }
        System.out.println("총 결제금액 : " + sum);

    }
}
