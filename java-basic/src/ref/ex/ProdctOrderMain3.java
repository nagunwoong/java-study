package ref.ex;

import java.util.Scanner;

public class ProdctOrderMain3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("입력할 주문의 개수를 입력하세요");
        int n = scanner.nextInt();
        scanner.nextLine();


        ProdctOrder[] orders = new ProdctOrder[n];
        for (int i = 0; i < orders.length; i++) {
            System.out.println((i + 1) + "번재 주문 정보를 확인하세요");

            System.out.print("상품명");
            String produtName = scanner.nextLine();

            System.out.print("가격");
            int price = scanner.nextInt();


            System.out.print("수량");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            orders[i] = createOrder(produtName, price, quantity);

        }
        printOrders(orders);
        int total = printTotal(orders);
        System.out.println("총 가격은 : " + total);
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



