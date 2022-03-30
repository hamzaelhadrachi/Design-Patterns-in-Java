package com.hamza.z2h.builder_pattern.telescoping;

public class LunchOrderBean {

    private String bread;
    private String condiments;
    private String dressing;
    private String meat;

    public LunchOrderBean(String bread) {
        this.bread = bread;
    }

    public LunchOrderBean(String bread, String condiments) {
        this(bread);
        this.condiments = condiments;
    }

    public LunchOrderBean(String bread, String condiments, String dressing) {
        this(bread, condiments);
        this.dressing = dressing;
    }

    public LunchOrderBean(String bread, String condiments, String dressing, String meat) {
        this(bread, condiments, dressing);
        this.meat = meat;
    }
}
