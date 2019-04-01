package com.estelle.pattern.structural.facaed;

public class PointPaymentService {
    public boolean pay(PointsGift pointsGift) {
        //扣减积分

        System.out.printf("支付" + pointsGift.getName());
        return true;
    }
}
