package ref.ex;

import java.util.ArrayList;
import java.util.List;

public class ProdctOrderMain2 {

    public static void main(String[] args) {

        ProdctOrder[] order = new ProdctOrder[3];

        order[0] = createOrder("수박", 2000, 3);
        order[1] = createOrder("참외", 4000, 2);
        order[2] = createOrder("토마토", 8000, 8);


        printOrders(order);
        int total = printTotal(order);
        System.out.println("총 가격 : " + total);


    }

    static ProdctOrder createOrder(String productName, int price, int quantity) {
        ProdctOrder orders = new ProdctOrder();
        orders.productName = productName;
        orders.price = price;
        orders.quantity = quantity;
        return orders;

    }

    static void printOrders(ProdctOrder[] orders) {
        for (ProdctOrder order : orders) {
            System.out.println("과일은 : " + order.productName + " 가격은 : " + order.price + " 수량은 : " + order.quantity);
        }
    }

    static int printTotal(ProdctOrder[] orders) {
        int total = 0;
        for (ProdctOrder order : orders) {
            total += order.price * order.quantity;
        }
        return total;
}
    }



