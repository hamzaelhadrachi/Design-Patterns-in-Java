package com.hamza.z2h.factory_pattern;

public class FactoryDemo {

    public static void main(String[] args){
        Website site = WebsiteFactory.getWebsite(WebsiteType.BLOG);

        System.out.println(site.getPages());
    }
}
