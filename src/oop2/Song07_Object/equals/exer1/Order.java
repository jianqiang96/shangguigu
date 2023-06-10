package oop2.Song07_Object.equals.exer1;

import java.util.Objects;

/*
@User   jianqiang
@Create 2023/6/6 22:44 周二

@Description 
*/
public class Order {
    private int orderId;
    private String orderName;

    public Order() {
    }

    public Order(int orderId, String orderName) {
        this.orderId = orderId;
        this.orderName = orderName;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    // 重写
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Order order = (Order) obj;
        return orderId == order.orderId && Objects.equals(orderName, order.orderName);
    }

    public boolean equals_test(Object obj) {
        if (this == obj) return true;
        if (obj instanceof Order) {
            Order order = (Order) obj;
            return this.orderId == order.orderId && this.orderName.equals(order.orderName);
        } else {
            return false;
        }
    }

}



