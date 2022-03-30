package com.hamza.z2h.builder_pattern.builder;

public class LunchOrderBean {
    private String bread;
    private String condiments;
    private String dressing;
    private String meat;

    public static class Builder{
        private String bread;
        private String condiments;
        private String dressing;
        private String meat;

        public Builder() {
        }
        public lunchOrder(){
            
        }

        public Builder bread(String bread){
            this.bread = bread;
            return this;
        }
        public Builder condiments(String condiments){
            this.condiments = condiments;
            return this;
        }
        public Builder dressing(String dressing){
            this.dressing = dressing;
            return this;
        }
        public Builder meat(String meat){
            this.meat = meat;
            return this;
        }
    }



    public String getBread() {
        return bread;
    }

    public String getCondiments() {
        return condiments;
    }

    public String getDressing() {
        return dressing;
    }

    public String getMeat() {
        return meat;
    }
}
