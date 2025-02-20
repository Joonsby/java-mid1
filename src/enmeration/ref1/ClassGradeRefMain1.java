package enmeration.ref1;

import static enmeration.ref1.ClassGrade.*;

public class ClassGradeRefMain1 {
    public static void main(String[] args) {
        int price = 10000;
        DiscountService discountService = new DiscountService();
        int basic = discountService.discount(BASIC,price);
        int gold = discountService.discount(GOLD,price);
        int diamond = discountService.discount(DIAMOND,price);

        System.out.println(basic);
        System.out.println(gold);
        System.out.println(diamond);
    }
}
