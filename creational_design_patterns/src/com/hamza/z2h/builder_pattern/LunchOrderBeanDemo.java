package com.hamza.z2h.builder_pattern;

import com.hamza.z2h.builder_pattern.builder.LunchOrder;

public class LunchOrderBeanDemo {

    public static void main (String[] args){

        LunchOrder.Builder builder = new LunchOrder.Builder();

        builder.meat("ham").condiments("lettuce").dressing("Mayo").bread("Wheat");

        LunchOrder order = builder.build();

        System.out.println(order);
    }
}
