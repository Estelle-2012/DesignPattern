package com.estelle.pattern.structural.facaed;

public class ShoppingService {
    public String shipGift(PointsGift pointsGift) {
        System.out.println("进入物流 = [" + pointsGift + "]");
        return "进入物流 = [" + pointsGift + "]";
    }
}
